package com.enoca.DatabaseOperation.business.dto.request.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateEmployeeRequest {
    private String firstName;
    private String lastName;
    private String department;
    private int companyId;
}
