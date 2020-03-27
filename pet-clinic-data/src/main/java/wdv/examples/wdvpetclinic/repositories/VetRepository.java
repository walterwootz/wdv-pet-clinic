package wdv.examples.wdvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wdv.examples.wdvpetclinic.models.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
