package com.enoca.DatabaseOperation.business.rules;

import com.enoca.DatabaseOperation.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeBusinessRules {

    private final EmployeeRepository repository;

    public void checkIfExistsEmployeeById(int id){
        if(!repository.existsById(id))
            throw new RuntimeException("Employee does not exists. id:" + id);
    }

    public void checkIfExistsEmployeeByNationalityId(String nationalityId){
        if(repository.existsByNationalityId(nationalityId))
            throw new RuntimeException("Employee already exists. id:" + nationalityId);
    }
}
