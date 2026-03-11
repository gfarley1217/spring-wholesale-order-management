package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.dto.OrderDto;
import edu.wctc.wholesale.service.WholesaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderRestController {

    private final WholesaleOrderService wholesaleOrderService;

    @Autowired
    public OrderRestController(WholesaleOrderService wholesaleOrderService) {
        this.wholesaleOrderService = wholesaleOrderService;
    }

    @GetMapping("/api/orders/")
    public List<OrderDto> getOrders() {
        return wholesaleOrderService.getAllOrderDtos();
    }
}