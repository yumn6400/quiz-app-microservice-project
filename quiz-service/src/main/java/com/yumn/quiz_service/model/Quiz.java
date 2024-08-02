package com.yumn.quiz_service.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String title;

    @ElementCollection
    private List<Integer> questionIds;
}
