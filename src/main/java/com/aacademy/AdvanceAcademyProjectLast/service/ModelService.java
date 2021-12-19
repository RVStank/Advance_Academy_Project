package com.aacademy.AdvanceAcademyProjectLast.service;

import com.aacademy.AdvanceAcademyProjectLast.model.Model;


import java.util.Optional;
import java.util.Set;

public interface ModelService {
    Model findByModel(String Model);
    Model save(Model model);
    Optional<Model> findById(Long id);
    Set<Model> findAll();
}
