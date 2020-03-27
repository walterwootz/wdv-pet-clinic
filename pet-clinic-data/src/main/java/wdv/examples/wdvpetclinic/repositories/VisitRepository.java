package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
