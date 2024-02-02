package de.fheger.backend.repository;

import de.fheger.backend.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    //Record findTopByOrderByIdDesc();
}
