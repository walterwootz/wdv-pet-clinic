package wdv.examples.wdvpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wdv.examples.wdvpetclinic.models.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    Owner owner;
    OwnerServiceMap ownerServiceMap;
    final Long ownerId = 1L;
    final String ownerLastName = "Vergara";


    @BeforeEach
    void setUp() {
        owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(ownerLastName);
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(owners.size(),1);
    }

    @Test
    void saveExistingId() {
        Owner owner1 = new Owner();
        owner1.setId(2L);
        Owner savedOwner = ownerServiceMap.save(owner1);
        assertEquals(owner1.getId(), savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerServiceMap.save(new Owner());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner1 = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner1.getId());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(owner);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        Set<Owner> foundOwners = ownerServiceMap.findByLastName(ownerLastName);
        assertNotEquals(0, foundOwners.size());
        assertEquals(1, foundOwners.size());
        assertNotNull(foundOwners.iterator().next());
        assertEquals(ownerLastName, foundOwners.iterator().next().getLastName());
    }
}