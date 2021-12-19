package com.aacademy.AdvanceAcademyProjectLast.service;

import com.aacademy.AdvanceAcademyProjectLast.model.HorsePower;

import java.util.Optional;
import java.util.Set;

public interface HorsePowerService {
    Optional<HorsePower> findByHorsepower(String Horsepower);
    HorsePower save(HorsePower Horsepower);
    Optional<HorsePower> findById(Long id);
    Set<HorsePower> findAll();
}
