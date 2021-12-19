package com.aacademy.AdvanceAcademyProjectLast.service;

import com.aacademy.AdvanceAcademyProjectLast.model.Year;

import java.util.Optional;
import java.util.Set;

public interface YearService {
    Optional<Year> findByYear(Integer year);
    Year save(Year year);
    Optional<Year> findById(Long id);
    Set<Year> findAll();
}
