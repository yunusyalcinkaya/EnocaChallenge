package com.enoca.DatabaseOperation.business.concrete;

import com.enoca.DatabaseOperation.business.abstracts.EmployeeService;
import com.enoca.DatabaseOperation.business.dto.request.create.CreateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.request.update.UpdateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetAllEmployeesResponse;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.create.CreateEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.update.UpdateEmployeeResponse;
import com.enoca.DatabaseOperation.entities.Employee;
import com.enoca.DatabaseOperation.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {

    private  final EmployeeRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllEmployeesResponse> getAll() {
        List<Employee> employees = repository.findAll();
        List<GetAllEmployeesResponse> response =
                employees.stream().map(employee -> mapper.map(employee,GetAllEmployeesResponse.class)).toList();
        return response;
    }

    @Override
    public GetEmployeeResponse getById(int id) {
        checkIfExistsEmployeeById(id);
        Employee employee = repository.findById(id).orElseThrow();
        GetEmployeeResponse response = mapper.map(employee,GetEmployeeResponse.class);
        return response;
    }

    @Override
    public CreateEmployeeResponse add(CreateEmployeeRequest request) {
        Employee employee = mapper.map(request,Employee.class);
        employee.setId(0);
        repository.save(employee);
        CreateEmployeeResponse response = mapper.map(employee,CreateEmployeeResponse.class);
        return response;
    }

    @Override
    public UpdateEmployeeResponse update(int id, UpdateEmployeeRequest request) {
        checkIfExistsEmployeeById(id);
        Employee employee = mapper.map(request,Employee.class);
        employee.setId(id);
        repository.save(employee);
        UpdateEmployeeResponse response = mapper.map(employee,UpdateEmployeeResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        checkIfExistsEmployeeById(id);
        repository.deleteById(id);
    }

    private void checkIfExistsEmployeeById(int id){
        if(!repository.existsById(id))
            throw new RuntimeException("Employee does not exists. id:" + id);
    }
}
