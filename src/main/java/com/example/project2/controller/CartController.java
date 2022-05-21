package com.example.project2.controller;


import com.example.project2.entity.Cart;
import com.example.project2.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Cart add_cart(@RequestBody Cart cart){
        return cartService.add_cart(cart);
    }

    @GetMapping("/get")
    public List<Cart> get_all_carts(){
        return cartService.get_all_carts();
    }

    @GetMapping("/get/{id}")
    public Cart get_cart_by_id(@PathVariable("id") long id){
        return cartService.get_cart_by_id(id);
    }

    @PutMapping("/update/{id}")
    public Cart update_cart(@RequestBody Cart cart, @PathVariable("id") long id){
        return cartService.update_cart(cart, id);
    }

    @DeleteMapping("/delete/{id_to_delete}")
    public void delete_cart(@PathVariable("id_to_delete") long id){
        cartService.delete_cart(id);
    }

    @GetMapping("/cost")
    public double get_sum_carts(@PathVariable("id") long id){
        return cartService.sum_cart(id);
    }

}