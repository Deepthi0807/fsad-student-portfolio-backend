package com.portfolio.backend.service;

import com.portfolio.backend.model.project;
import com.portfolio.backend.repository.Projectrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Projectservice {
	 public List<project> getAllProjects() { return Projectrepository.findAll(); }
	    public List<project> getFeaturedProjects() { return Projectrepository.findByFeaturedTrue(); }
	    public project addProject(project project) { return Projectrepository.save(project); }
	    public void deleteProject(Long id) { Projectrepository.deleteById(id); }
	}

