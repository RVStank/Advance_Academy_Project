package com.aacademy.AdvanceAcademyProjectLast.repository;


import com.aacademy.AdvanceAcademyProjectLast.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository <Brand,String>{
    Optional<Brand> findByBrand (String brand);
}
