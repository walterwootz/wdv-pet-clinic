package wdv.examples.wdvpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wdv.examples.wdvpetclinic.models.Speciality;
import wdv.examples.wdvpetclinic.repositories.SpecilityRepository;
import wdv.examples.wdvpetclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class SpecialityServiceJPA implements SpecialityService {

    private final SpecilityRepository specilityRepository;

    public SpecialityServiceJPA(SpecilityRepository specilityRepository) {
        this.specilityRepository = specilityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specilityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality save(Speciality object) {
        return specilityRepository.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return specilityRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Speciality object) {
        specilityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specilityRepository.deleteById(id);
    }
}
