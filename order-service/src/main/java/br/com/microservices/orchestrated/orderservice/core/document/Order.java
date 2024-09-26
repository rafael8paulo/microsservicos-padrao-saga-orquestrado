package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order {

    @Id
    private String id;
    private List<OrderProducts> products;
    private LocalDateTime createdAt;
    private String transactionId;
    private double totalAmount;
    private int totalItems;

}
