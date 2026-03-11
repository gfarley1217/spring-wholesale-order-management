package edu.wctc.wholesale.service;

import edu.wctc.wholesale.dto.OrderDto;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repo.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class WholesaleOrderService {

    private final WholesaleOrderRepository wholesaleOrderRepository;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");

    @Autowired
    public WholesaleOrderService(WholesaleOrderRepository wholesaleOrderRepository) {
        this.wholesaleOrderRepository = wholesaleOrderRepository;
    }

    public List<WholesaleOrder> getAllOrders() {
        return wholesaleOrderRepository.findAll();
    }

    public List<OrderDto> getAllOrderDtos() {
        return wholesaleOrderRepository.findAll()
                .stream()
                .map(order -> new OrderDto(
                        order.getCustomer().getName(),
                        order.getPurchaseDate() != null ? order.getPurchaseDate().format(formatter) : "",
                        order.getPurchaseOrderNumber(),
                        order.getProduct().getName(),
                        order.getTerms(),
                        order.getShippedDate() != null ? order.getShippedDate().format(formatter) : "",
                        order.getProduct().getCost()
                ))
                .toList();
    }
}