package com.portfolio.backend.controller;

import com.portfolio.backend.model.skill;
import com.portfolio.backend.service.Skillservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
public class Skillcontroller {
	private final Skillservice Skillservice;

	    @GetMapping
	    public List<skill> getAll() { return Skillservice.getAllSkills(); }

	    @GetMapping("/category/{category}")
	    public List<skill> getByCategory(@PathVariable String category) {
	        return Skillservice.getByCategory(category);
	    }

	    @PostMapping
	    public skill add(@RequestBody skill skill) { return Skillservice.addSkill(skill); }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	        Skillservice.deleteSkill(id);
	        return ResponseEntity.noContent().build();
	    }
}
