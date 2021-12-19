package com.aacademy.AdvanceAcademyProjectLast.repository;

import com.aacademy.AdvanceAcademyProjectLast.model.HorsePower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HorsePowerRepository extends JpaRepository <HorsePower,String>{
    Optional<HorsePower> findByHorsePower (String horsePower);
}
