package com.portfolio.backend.service;

import com.portfolio.backend.model.skill;
import com.portfolio.backend.repository.skillrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Skillservice {

	private final skillrepository skillrepository;

    public List<skill> getAllSkills() { return skillrepository.findAll(); }
    public skill addSkill(skill skill) { return skillrepository.save(skill); }
    public void deleteSkill(Long id) { skillrepository.deleteById(id); }
    public List<skill> getByCategory(String category) {
        return skillrepository.findByCategory(category);
    }
}
