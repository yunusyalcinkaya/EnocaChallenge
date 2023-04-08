package com.enoca.DatabaseOperation.business.abstracts;


import com.enoca.DatabaseOperation.business.dto.request.create.CreateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.request.update.UpdateEmployeeRequest;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetAllEmployeesResponse;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.create.CreateEmployeeResponse;
import com.enoca.DatabaseOperation.business.dto.response.update.UpdateEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<GetAllEmployeesResponse> getAll();
    GetEmployeeResponse getById(int id);
    CreateEmployeeResponse add(CreateEmployeeRequest request);
    UpdateEmployeeResponse update(int id, UpdateEmployeeRequest request);
    void delete(int id);
}
