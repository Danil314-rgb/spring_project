package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.persistence.AccidentStore;

import java.util.Collection;

@Service
public class AccidentService {

    private final AccidentStore store;

    public AccidentService(AccidentStore store) {
        this.store = store;
    }

    public Collection<Accident> findAll() {
        return store.findAll();
    }
}
