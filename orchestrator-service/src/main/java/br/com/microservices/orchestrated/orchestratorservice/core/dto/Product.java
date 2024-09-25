package br.com.microservices.orchestrated.orchestratorservice.core.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String code;
    private double unitVal;

}
