package ru.job4j.accident.persistence;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AccidentStore {

    private final Map<Integer, Accident> accidents = new HashMap<>();

    public AccidentStore() {
        accidents.put(1, new Accident(1, "Ivan", "Accident 1", "Street 1"));
        accidents.put(2, new Accident(2, "Petr", "Accident 2", "Street 2"));
        accidents.put(3, new Accident(3, "Sidor", "Accident 3", "Street 3"));
    }

    public Collection<Accident> findAll() {
        return accidents.values();
    }
}
