package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
