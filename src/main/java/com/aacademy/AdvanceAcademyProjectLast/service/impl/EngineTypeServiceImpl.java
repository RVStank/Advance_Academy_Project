package com.aacademy.AdvanceAcademyProjectLast.service.impl;

import com.aacademy.AdvanceAcademyProjectLast.exception.DuplicateItemException;
import com.aacademy.AdvanceAcademyProjectLast.exception.ItemNotFoundException;
import com.aacademy.AdvanceAcademyProjectLast.model.Brand;
import com.aacademy.AdvanceAcademyProjectLast.model.EngineType;
import com.aacademy.AdvanceAcademyProjectLast.repository.EngineTypeRepository;
import com.aacademy.AdvanceAcademyProjectLast.service.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service

public class EngineTypeServiceImpl implements EngineTypeService {
    private final EngineTypeRepository engineTypeRepository;
    @Autowired
    public EngineTypeServiceImpl(EngineTypeRepository engineTypeRepository) {
        this.engineTypeRepository = engineTypeRepository;
    }

    @Override
    public EngineType findByEngineType(String EngineType) {
        return engineTypeRepository.findByEngineType(EngineType);
    }

    @Override
    public EngineType save(EngineType engineType) {
        try {
            return engineTypeRepository.save(engineType);
        } catch (DataIntegrityViolationException exception) {
            throw new DuplicateItemException("Brand already exists");
        }
    }

    @Override
    public Optional<EngineType> findById(Long id) {
        return engineTypeRepository.findById(id.toString());
    }

    @Override
    public Set<EngineType> findAll() {
        return new HashSet<>(engineTypeRepository.findAll());
    }
}
