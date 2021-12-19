package com.aacademy.AdvanceAcademyProjectLast.service.impl;

import com.aacademy.AdvanceAcademyProjectLast.exception.DuplicateItemException;
import com.aacademy.AdvanceAcademyProjectLast.exception.ItemNotFoundException;
import com.aacademy.AdvanceAcademyProjectLast.model.Model;
import com.aacademy.AdvanceAcademyProjectLast.repository.ModelRepository;

import com.aacademy.AdvanceAcademyProjectLast.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service

public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;
    @Autowired
    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public Model save(Model model) {
        try {
            return modelRepository.save(model);
        } catch (DataIntegrityViolationException exception) {
            throw new DuplicateItemException("Model already exists");
        }
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelRepository.findById(id.toString());
    }

    @Override
    public Set<Model> findAll() {
        return new HashSet<>(modelRepository.findAll());
    }

    @Override
    public Model findByModel(String model) {
        return modelRepository.findByModel(model)
                .orElseThrow(() -> new ItemNotFoundException("Model not found exception"));
    }
}
