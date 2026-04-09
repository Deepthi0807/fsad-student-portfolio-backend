package com.portfolio.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectResponse {
    // Frontend uses project._id so serialize as "_id"
    @JsonProperty("_id")
    private String id;
 
    private String title;
    private String description;
    private String milestone;
    private Integer progress;
    private String media;
    private Boolean reviewed;
 
    public ProjectResponse() {}
 
    public ProjectResponse(String id, String title, String description,
                           String milestone, Integer progress,
                           String media, Boolean reviewed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.milestone = milestone;
        this.progress = progress;
        this.media = media;
        this.reviewed = reviewed;
    }
 
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getMilestone() { return milestone; }
    public Integer getProgress() { return progress; }
    public String getMedia() { return media; }
    public Boolean getReviewed() { return reviewed; }
 
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setMilestone(String milestone) { this.milestone = milestone; }
    public void setProgress(Integer progress) { this.progress = progress; }
    public void setMedia(String media) { this.media = media; }
    public void setReviewed(Boolean reviewed) { this.reviewed = reviewed; }
}
