package com.enoca.DatabaseOperation.api.controllers;

import com.enoca.DatabaseOperation.business.abstracts.CompanyService;
import com.enoca.DatabaseOperation.business.dto.request.create.CreateCompanyRequest;
import com.enoca.DatabaseOperation.business.dto.request.update.UpdateCompanyRequest;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetAllCompaniesResponse;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetCompanyResponse;
import com.enoca.DatabaseOperation.business.dto.response.create.CreateCompanyResponse;
import com.enoca.DatabaseOperation.business.dto.response.update.UpdateCompanyResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompaniesController {

    private final CompanyService service;

    @GetMapping
    public List<GetAllCompaniesResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetCompanyResponse geById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    public CreateCompanyResponse add(CreateCompanyRequest request){
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateCompanyResponse update(@PathVariable int id, @RequestBody UpdateCompanyRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.deleteById(id);
    }
}
