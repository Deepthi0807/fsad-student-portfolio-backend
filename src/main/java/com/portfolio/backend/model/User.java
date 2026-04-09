package com.portfolio.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, unique = true)
	    private String username;

	    @Column(nullable = false)
	    private String password;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private String role;

	    private String email;

	    private String studentId;

	    public User() {}

	    public Long getId() { return id; }
	    public String getUsername() { return username; }
	    public String getPassword() { return password; }
	    public String getName() { return name; }
	    public String getRole() { return role; }
	    public String getEmail() { return email; }
	    public String getStudentId() { return studentId; }

	    public void setId(Long id) { this.id = id; }
	    public void setUsername(String username) { this.username = username; }
	    public void setPassword(String password) { this.password = password; }
	    public void setName(String name) { this.name = name; }
	    public void setRole(String role) { this.role = role; }
	    public void setEmail(String email) { this.email = email; }
	    public void setStudentId(String studentId) { this.studentId = studentId; }
}
