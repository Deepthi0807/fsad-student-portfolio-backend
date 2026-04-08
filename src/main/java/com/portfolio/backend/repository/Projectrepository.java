package com.portfolio.backend.repository;

import com.portfolio.backend.model.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Projectrepository extends JpaRepository<project, Long> {
    List<project> findByFeaturedTrue();
}
