package com.portfolio.backend.dto;



public class StudentSummary {
	  private String id;     // studentId e.g. "240003001"
	    private String name;
	    private String email;
	    private long projects;
	    private long reviewed;
	    private long pending;
	 
	    public StudentSummary() {}
	 
	    public StudentSummary(String id, String name, String email,
	                          long projects, long reviewed, long pending) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.projects = projects;
	        this.reviewed = reviewed;
	        this.pending = pending;
	    }
	 
	    public String getId() { return id; }
	    public String getName() { return name; }
	    public String getEmail() { return email; }
	    public long getProjects() { return projects; }
	    public long getReviewed() { return reviewed; }
	    public long getPending() { return pending; }
	 
	    public void setId(String id) { this.id = id; }
	    public void setName(String name) { this.name = name; }
	    public void setEmail(String email) { this.email = email; }
	    public void setProjects(long projects) { this.projects = projects; }
	    public void setReviewed(long reviewed) { this.reviewed = reviewed; }
	    public void setPending(long pending) { this.pending = pending; }
}
