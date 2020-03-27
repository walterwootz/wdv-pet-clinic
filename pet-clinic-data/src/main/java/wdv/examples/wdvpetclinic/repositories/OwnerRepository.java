package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
