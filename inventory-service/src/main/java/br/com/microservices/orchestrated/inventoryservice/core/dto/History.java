package br.com.microservices.orchestrated.inventoryservice.core.dto;

import br.com.microservices.orchestrated.inventoryservice.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {

    private String source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createdAt;

}