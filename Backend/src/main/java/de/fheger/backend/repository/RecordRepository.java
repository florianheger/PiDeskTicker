package de.fheger.backend.repository;

import de.fheger.backend.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    //@Query("select t.* from record t inner join (select max(date_time) as MaxDate from record) tm on t.date_time = tm.MaxDate")
    //Record findTopByOrderByIdDesc();
}
