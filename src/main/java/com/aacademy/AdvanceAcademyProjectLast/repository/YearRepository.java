package com.aacademy.AdvanceAcademyProjectLast.repository;

import com.aacademy.AdvanceAcademyProjectLast.model.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YearRepository extends JpaRepository <Year,Integer>{
    Optional<Year> findByYear (Integer year);

    Optional<Year> findById(String toString);
}
