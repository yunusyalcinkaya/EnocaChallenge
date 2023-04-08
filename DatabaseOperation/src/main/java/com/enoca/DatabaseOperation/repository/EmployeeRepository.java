package com.enoca.DatabaseOperation.repository;


import com.enoca.DatabaseOperation.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
