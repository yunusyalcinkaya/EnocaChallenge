package com.enoca.DatabaseOperation.business.rules;

import com.enoca.DatabaseOperation.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyBusinessRules {

    private final CompanyRepository repository;

    public void checkIfExistsCompanyById(int id){
        if (!repository.existsById(id))
            throw new RuntimeException("Company does not exists. id:"+ id);
    }
}
