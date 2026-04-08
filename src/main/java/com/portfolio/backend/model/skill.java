package com.portfolio.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "skills")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class skill {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private Integer proficiencyLevel;
    private String iconUrl;
    
}
