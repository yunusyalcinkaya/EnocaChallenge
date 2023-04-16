package com.enoca.DatabaseOperation.business.dto.response.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private String department;
    private int companyId;
}
