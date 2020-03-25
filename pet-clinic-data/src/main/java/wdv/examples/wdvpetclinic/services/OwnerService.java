package wdv.examples.wdvpetclinic.services;

import wdv.examples.wdvpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Set<Owner> findByLastName(String lastName);

}
