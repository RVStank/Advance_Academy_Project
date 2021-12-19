package com.aacademy.AdvanceAcademyProjectLast.repository;

import com.aacademy.AdvanceAcademyProjectLast.model.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineTypeRepository extends JpaRepository <EngineType, String> {
    EngineType findByEngineType (String engineType);
}
