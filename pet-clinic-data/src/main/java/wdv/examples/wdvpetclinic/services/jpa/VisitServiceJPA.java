package wdv.examples.wdvpetclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wdv.examples.wdvpetclinic.models.Visit;
import wdv.examples.wdvpetclinic.repositories.VisitRepository;
import wdv.examples.wdvpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("jpa")
public class VisitServiceJPA implements VisitService {

    private final VisitRepository visitRepository;

    public VisitServiceJPA(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public Visit findById(Long id) {
        Optional<Visit> optionalVisit = visitRepository.findById(id);
        return optionalVisit.orElse(null);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
