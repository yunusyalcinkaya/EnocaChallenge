package com.enoca.DatabaseOperation.repository;


import com.enoca.DatabaseOperation.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
