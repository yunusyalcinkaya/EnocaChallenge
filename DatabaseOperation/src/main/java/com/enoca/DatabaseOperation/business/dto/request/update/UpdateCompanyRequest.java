package com.enoca.DatabaseOperation.business.dto.request.update;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyRequest {
    @NotBlank
    String name;

    @NotBlank
    String address;
}
