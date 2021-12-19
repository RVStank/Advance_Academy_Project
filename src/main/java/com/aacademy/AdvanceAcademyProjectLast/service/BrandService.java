package com.aacademy.AdvanceAcademyProjectLast.service;

import com.aacademy.AdvanceAcademyProjectLast.model.Brand;


import java.util.Optional;
import java.util.Set;

public interface BrandService {
    Brand findByBrand(String Brand);
    Brand save(Brand brand);
    Optional<Brand> findById(Long id);
    Set<Brand> findAll();
}
