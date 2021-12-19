package com.aacademy.AdvanceAcademyProjectLast.service;

import com.aacademy.AdvanceAcademyProjectLast.model.Brand;
import com.aacademy.AdvanceAcademyProjectLast.model.EngineType;

import java.util.Optional;
import java.util.Set;

public interface EngineTypeService {
    EngineType findByEngineType(String EngineType);
    EngineType save(EngineType EngineType);
    Optional<EngineType> findById(Long id);
    Set<EngineType> findAll();
}
