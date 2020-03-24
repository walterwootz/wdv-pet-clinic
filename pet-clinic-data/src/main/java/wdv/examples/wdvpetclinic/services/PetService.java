package wdv.examples.wdvpetclinic.services;

import wdv.examples.wdvpetclinic.model.Owner;
import wdv.examples.wdvpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Set<Pet> findByOwner(Owner owner);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
