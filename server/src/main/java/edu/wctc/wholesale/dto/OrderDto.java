package edu.wctc.wholesale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private String customerName;
    private String purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private String shippedDate;
    private double productCost;
}