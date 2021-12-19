package com.aacademy.AdvanceAcademyProjectLast.service.impl;

import com.aacademy.AdvanceAcademyProjectLast.exception.DuplicateItemException;
import com.aacademy.AdvanceAcademyProjectLast.exception.ItemNotFoundException;
import com.aacademy.AdvanceAcademyProjectLast.model.Year;
import com.aacademy.AdvanceAcademyProjectLast.repository.YearRepository;
import com.aacademy.AdvanceAcademyProjectLast.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service

public class YearServiceImpl implements YearService {

    private final YearRepository yearRepository;
    @Autowired
    public YearServiceImpl(YearRepository yearRepository) {
        this.yearRepository = yearRepository;
    }

    @Override
    public Optional<Year> findByYear(Integer year) {
        return yearRepository.findByYear(year);
    }

    @Override
    public Year save(Year year) {
        try {
            return yearRepository.save(year);
        } catch (DataIntegrityViolationException exception) {
            throw new DuplicateItemException("Year already exists");
        }
    }

    @Override
    public Optional<Year> findById(Long id) {
        return yearRepository.findById(id.toString());
    }

    @Override
    public Set<Year> findAll() {
        return new HashSet<>(yearRepository.findAll());
    }
}
