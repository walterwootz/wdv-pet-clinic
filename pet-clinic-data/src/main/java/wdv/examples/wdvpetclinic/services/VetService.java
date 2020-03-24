package wdv.examples.wdvpetclinic.services;

import wdv.examples.wdvpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
