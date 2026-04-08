package com.portfolio.backend.controller;

import com.portfolio.backend.model.project;
import com.portfolio.backend.service.Projectservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class Projectcontroller {
	 private final Projectservice Projectservice;

	    @GetMapping
	    public List<project> getAll() { return Projectservice.getAllProjects(); }

	    @GetMapping("/featured")
	    public List<project> getFeatured() { return Projectservice.getFeaturedProjects(); }

	    @PostMapping
	    public project add(@RequestBody project project) { return Projectservice.addProject(project); }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	        Projectservice.deleteProject(id);
	        return ResponseEntity.noContent().build();
	    }
}
