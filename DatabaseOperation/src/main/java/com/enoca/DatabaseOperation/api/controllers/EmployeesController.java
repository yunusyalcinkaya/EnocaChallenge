package com.enoca.DatabaseOperation.api.controllers;

import com.enoca.DatabaseOperation.business.abstracts.EmployeeService;
import com.enoca.DatabaseOperation.business.dto.request.create.CreateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.request.update.UpdateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetAllEmployeesResponse;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.create.CreateEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.update.UpdateEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeesController {

    private final EmployeeService service;

    @GetMapping
    public List<GetAllEmployeesResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetEmployeeResponse geById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    public CreateEmployeeResponse add(CreateEmployeeRequest request){
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateEmployeeResponse update(@PathVariable int id, @RequestBody UpdateEmployeeRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.deleteById(id);
    }
}

