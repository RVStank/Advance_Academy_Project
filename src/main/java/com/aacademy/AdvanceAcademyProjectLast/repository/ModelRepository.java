package com.aacademy.AdvanceAcademyProjectLast.repository;

import com.aacademy.AdvanceAcademyProjectLast.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository <Model,String>{
    Optional<Model> findByModel (String model);
}
