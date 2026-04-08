package com.portfolio.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projects")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class project {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    @Column(columnDefinition = "TEXT")
	    private String description;
	    private String techStack;
	    private String githubLink;
	    private String liveLink;
	    private String imageUrl;
	    private Boolean featured;
}
