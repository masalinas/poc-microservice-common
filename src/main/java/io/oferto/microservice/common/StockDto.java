package io.oferto.microservice.common;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockDto {
    private Long id;
    private Long productId; 
    private String lot;
    private Date expirationDate;
    private BigDecimal quantity;
    private ProductDto product;
}
