package com.aacademy.AdvanceAcademyProjectLast.service.impl;

import com.aacademy.AdvanceAcademyProjectLast.exception.DuplicateItemException;
import com.aacademy.AdvanceAcademyProjectLast.model.HorsePower;
import com.aacademy.AdvanceAcademyProjectLast.repository.HorsePowerRepository;
import com.aacademy.AdvanceAcademyProjectLast.service.HorsePowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class HorsePowerServiceImpl implements HorsePowerService {
    private final HorsePowerRepository horsePowerRepository;
    @Autowired
    public HorsePowerServiceImpl(HorsePowerRepository horsePowerRepository) {
        this.horsePowerRepository = horsePowerRepository;
    }

    @Override
    public Optional<HorsePower> findByHorsepower(String Horsepower) {
        return horsePowerRepository.findByHorsePower(Horsepower);
    }

    @Override
    public HorsePower save(HorsePower horsepower) {
        try {
            return horsePowerRepository.save(horsepower);
        } catch (DataIntegrityViolationException exception) {
            throw new DuplicateItemException("Brand already exists");
        }
    }

    @Override
    public Optional<HorsePower> findById(Long id) {
        return horsePowerRepository.findById(id.toString());
    }

    @Override
    public Set<HorsePower> findAll() {
        return new HashSet<>(horsePowerRepository.findAll());
    }
}
