package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
