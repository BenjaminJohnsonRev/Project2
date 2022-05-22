package org.example.controller;

import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Order add_order(@RequestBody Order order){
        return orderService.add_order(order);
    }

    @GetMapping("/get")
    public List<Order> get_all_orders(){
        return orderService.get_all_orders();
    }

    @GetMapping("/get/{id}")
    public Order get_order_by_id(@PathVariable("id") long id){
        return orderService.get_order_by_id(id);
    }

    @PutMapping("/update/{id}")
    public Order update_order(@RequestBody Order order, @PathVariable("id") long id){
        return orderService.update_order(order, id);
    }

    @DeleteMapping("/delete/{id_to_delete}")
    public void delete_order(@PathVariable("id_to_delete") Long id){
        orderService.delete_order(id);
    }

}
