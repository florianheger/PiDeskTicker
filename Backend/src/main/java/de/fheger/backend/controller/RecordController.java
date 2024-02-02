package de.fheger.backend.controller;

import de.fheger.backend.model.Record;
import de.fheger.backend.repository.RecordRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/record")
@CrossOrigin(origins = "http://localhost:3000")
public class RecordController {
    private final RecordRepository recordRepository;

    @GetMapping("/latest")
    public ResponseEntity<Record> getLatestMeasuringPoint() {
        return ResponseEntity.ok(new Record());
        //return ResponseEntity.ok(recordRepository.findTopByOrderByIdDesc());
    }

    @PostMapping
    public ResponseEntity<Record> addRecord(@RequestBody Record record) {
        Record recordInDb = recordRepository.save(record);
        return ResponseEntity.ok(recordInDb);
    }
}
