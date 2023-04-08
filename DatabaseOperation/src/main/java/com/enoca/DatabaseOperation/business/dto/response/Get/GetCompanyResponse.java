package com.enoca.DatabaseOperation.business.dto.response.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCompanyResponse {
    private int id;
    private String name;
    private String address;
}
