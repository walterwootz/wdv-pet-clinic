package wdv.examples.wdvpetclinic.services.map;

import org.springframework.stereotype.Service;
import wdv.examples.wdvpetclinic.models.Owner;
import wdv.examples.wdvpetclinic.models.Pet;
import wdv.examples.wdvpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Pet> findByOwner(Owner owner) {
        return null;
    }
}
