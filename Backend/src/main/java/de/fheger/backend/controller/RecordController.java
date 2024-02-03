package de.fheger.backend.controller;

import de.fheger.backend.model.Record;
import de.fheger.backend.repository.RecordRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@AllArgsConstructor
@RestController
@RequestMapping("/api/record")
@CrossOrigin(origins = "http://localhost:3000")
public class RecordController {
    private final RecordRepository recordRepository;

    @GetMapping("/latest")
    public ResponseEntity<Record> getLatestMeasuringPoint() {
        List<Record> records = recordRepository.findAll();
        AtomicReference<Record> record = new AtomicReference<>(new Record());
        record.get().setId(-1);
        records.forEach(r -> {
            if (record.get().getId() < r.getId()) {
                record.set(r);
            }
        });
        return ResponseEntity.ok(record.get());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Record>> getLastMeasuringPoints() {
        List<Record> records = recordRepository.findAll();
        return ResponseEntity.ok(records);
    }

    @PostMapping
    public ResponseEntity<Record> addRecord(@RequestBody Record record) {
        Record recordInDb = recordRepository.save(record);
        return ResponseEntity.ok(recordInDb);
    }
}
