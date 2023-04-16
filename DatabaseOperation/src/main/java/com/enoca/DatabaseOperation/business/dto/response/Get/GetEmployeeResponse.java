package com.enoca.DatabaseOperation.business.dto.response.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private String department;
    private int companyId;
}
