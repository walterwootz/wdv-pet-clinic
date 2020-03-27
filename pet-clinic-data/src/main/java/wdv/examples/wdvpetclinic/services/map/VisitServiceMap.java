package wdv.examples.wdvpetclinic.services.map;

import wdv.examples.wdvpetclinic.models.Visit;
import wdv.examples.wdvpetclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
