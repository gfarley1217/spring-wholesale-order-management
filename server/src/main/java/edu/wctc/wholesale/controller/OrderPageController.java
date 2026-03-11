package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.service.WholesaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderPageController {

    private final WholesaleOrderService wholesaleOrderService;

    @Autowired
    public OrderPageController(WholesaleOrderService wholesaleOrderService) {
        this.wholesaleOrderService = wholesaleOrderService;
    }

    @GetMapping("/")
    public String showOrders(Model model) {
        model.addAttribute("orderList", wholesaleOrderService.getAllOrders());
        return "index";
    }
}
