package com.portfolio.backend.repository;

import com.portfolio.backend.model.skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface skillrepository extends JpaRepository<skill, Long> {
    List<skill> findByCategory(String category);
}