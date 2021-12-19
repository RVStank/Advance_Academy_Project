package com.aacademy.AdvanceAcademyProjectLast.service.impl;

import com.aacademy.AdvanceAcademyProjectLast.exception.DuplicateItemException;
import com.aacademy.AdvanceAcademyProjectLast.exception.ItemNotFoundException;
import com.aacademy.AdvanceAcademyProjectLast.model.Brand;
import com.aacademy.AdvanceAcademyProjectLast.repository.BrandRepository;
import com.aacademy.AdvanceAcademyProjectLast.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service

public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand save(Brand brand) {
        try {
            return brandRepository.save(brand);
        } catch (DataIntegrityViolationException exception) {
            throw new DuplicateItemException("Brand already exists");
        }
    }

    @Override
    public Optional<Brand> findById(Long id) {
        return brandRepository.findById(id.toString());
    }

    @Override
    public Set<Brand> findAll() {
        return new HashSet<>(brandRepository.findAll());
    }

    @Override
    public Brand findByBrand(String brand) {
        return brandRepository.findByBrand(brand)
                .orElseThrow(() -> new ItemNotFoundException("Brand not found exception"));
    }
}
