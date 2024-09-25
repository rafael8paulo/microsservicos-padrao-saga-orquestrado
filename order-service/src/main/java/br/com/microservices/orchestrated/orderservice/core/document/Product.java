package br.com.microservices.orchestrated.orderservice.core.document;

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
