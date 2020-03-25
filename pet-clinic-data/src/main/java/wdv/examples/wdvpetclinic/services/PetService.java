package wdv.examples.wdvpetclinic.services;

import wdv.examples.wdvpetclinic.models.Owner;
import wdv.examples.wdvpetclinic.models.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Set<Pet> findByOwner(Owner owner);

}
