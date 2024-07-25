package org.example.app2.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@lombok.Data
@NoArgsConstructor

public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String info;


}



