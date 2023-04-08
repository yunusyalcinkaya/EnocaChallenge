package com.enoca.DatabaseOperation.business.dto.response.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyResponse {
    private int id;
    private String name;
    private String address;
}
