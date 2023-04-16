package com.enoca.DatabaseOperation.business.abstracts;


import com.enoca.DatabaseOperation.business.dto.request.create.CreateCompanyRequest;
import com.enoca.DatabaseOperation.business.dto.request.update.UpdateCompanyRequest;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetAllCompaniesResponse;
import com.enoca.DatabaseOperation.business.dto.response.Get.GetCompanyResponse;
import com.enoca.DatabaseOperation.business.dto.response.create.CreateCompanyResponse;
import com.enoca.DatabaseOperation.business.dto.response.update.UpdateCompanyResponse;

import java.util.List;

public interface CompanyService {
    List<GetAllCompaniesResponse> getAll();
    GetCompanyResponse getById(int id);
    CreateCompanyResponse add(CreateCompanyRequest request);
    UpdateCompanyResponse update(int id, UpdateCompanyRequest request);
    void deleteById(int id);
}
