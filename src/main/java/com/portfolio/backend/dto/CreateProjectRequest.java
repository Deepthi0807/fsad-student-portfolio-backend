package com.portfolio.backend.dto;

public class CreateProjectRequest {
	 private String title;
	    private String description;
	    private String milestone;
	    private Integer progress;
	    private String media;
	 
	    public CreateProjectRequest() {}
	 
	    public String getTitle() { return title; }
	    public String getDescription() { return description; }
	    public String getMilestone() { return milestone; }
	    public Integer getProgress() { return progress; }
	    public String getMedia() { return media; }
	 
	    public void setTitle(String title) { this.title = title; }
	    public void setDescription(String description) { this.description = description; }
	    public void setMilestone(String milestone) { this.milestone = milestone; }
	    public void setProgress(Integer progress) { this.progress = progress; }
	    public void setMedia(String media) { this.media = media; }
	}
