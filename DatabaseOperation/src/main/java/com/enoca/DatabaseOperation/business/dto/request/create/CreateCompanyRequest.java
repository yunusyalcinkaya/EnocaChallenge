package com.enoca.DatabaseOperation.business.dto.request.create;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCompanyRequest {
    @NotBlank
    String name;

    @NotBlank
    String address;
}
