package de.fheger.backend.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "record")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    float temperature;

    float humidity;

    @CreationTimestamp
    LocalDateTime dateTime;
}
