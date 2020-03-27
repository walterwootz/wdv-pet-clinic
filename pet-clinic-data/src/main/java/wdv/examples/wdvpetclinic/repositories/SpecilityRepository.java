package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.Speciality;

public interface SpecilityRepository extends CrudRepository<Speciality, Long> {
}
