package com.enoca.DatabaseOperation.business.dto.request.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCompanyRequest {
    String name;
    String address;
}
