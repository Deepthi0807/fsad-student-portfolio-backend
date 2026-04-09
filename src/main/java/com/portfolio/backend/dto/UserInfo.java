package com.portfolio.backend.dto;


public class UserInfo {
	private Long id;
    private String name;
    private String role;
    private String studentId;
    private String email;
 
    public UserInfo() {}
 
    public UserInfo(Long id, String name, String role, String studentId, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.studentId = studentId;
        this.email = email;
    }
 
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getStudentId() { return studentId; }
    public String getEmail() { return email; }
 
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setEmail(String email) { this.email = email; }
}

