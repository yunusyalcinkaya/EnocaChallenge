package com.enoca.DatabaseOperation.business.dto.request.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateEmployeeRequest {
    @Length(min = 2, max = 20, message = "Length of first name field must be between 2 and 20 characters")
    private String firstName;

    @Length(min = 2, max = 20,message = "Length of last name field must be between 2 and 20 characters")
    private String lastName;

    @Length(min = 2, max = 30, message = "Length of department name field must be between 2 and 30 characters")
    private String department;

    @NotNull(message = "Company id field can not be null")
    private int companyId;
}
