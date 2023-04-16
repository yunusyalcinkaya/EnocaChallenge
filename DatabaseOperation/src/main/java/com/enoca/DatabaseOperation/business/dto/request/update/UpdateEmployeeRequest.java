package com.enoca.DatabaseOperation.business.dto.request.update;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {
    @Length(min = 2, max = 20, message = "Length of first name field must be between 2 and 20 characters")
    private String firstName;

    @Length(min = 2, max = 20,message = "Length of last name field must be between 2 and 20 characters")
    private String lastName;

    @Length(min = 11, max = 11, message = "Length of nationality id must be 11 characters")
    private String nationalityId;

    @Length(min = 2, max = 30, message = "Length of department name field must be between 2 and 30 characters")
    private String department;

    @NotNull(message = "Company id field can not be null")
    private int companyId;
}
