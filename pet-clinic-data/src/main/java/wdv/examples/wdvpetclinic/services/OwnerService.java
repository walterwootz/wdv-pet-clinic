package wdv.examples.wdvpetclinic.services;

import wdv.examples.wdvpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
