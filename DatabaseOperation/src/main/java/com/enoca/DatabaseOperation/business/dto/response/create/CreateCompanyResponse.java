package com.enoca.DatabaseOperation.business.dto.response.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyResponse {
    private int id;
    private String name;
    private String address;
}
