package com.infoservice.schemeService.schemeRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeBenefits;


public interface SchemeBenefitsRepository extends JpaRepository<SchemeBenefits, Long>{
    Optional<List<SchemeBenefits>> findBySchemeName(String schemeName);
}
