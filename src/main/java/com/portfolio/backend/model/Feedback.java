package com.portfolio.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
public class Feedback {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String comment;

	    @Column(nullable = false, updatable = false)
	    private LocalDateTime givenAt;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "project_id", nullable = false)
	    private Project project;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "admin_id", nullable = false)
	    private User admin;

	    @PrePersist
	    public void prePersist() {
	        givenAt = LocalDateTime.now();
	    }

	    public Feedback() {}

	    public Long getId() { return id; }
	    public String getComment() { return comment; }
	    public LocalDateTime getGivenAt() { return givenAt; }
	    public Project getProject() { return project; }
	    public User getAdmin() { return admin; }

	    public void setId(Long id) { this.id = id; }
	    public void setComment(String comment) { this.comment = comment; }
	    public void setGivenAt(LocalDateTime givenAt) { this.givenAt = givenAt; }
	    public void setProject(Project project) { this.project = project; }
	    public void setAdmin(User admin) { this.admin = admin; }
}
