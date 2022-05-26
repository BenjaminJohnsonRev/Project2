package org.example.controller;


import org.example.dto.SandwichOrderIdObject;
import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.example.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Cart add_cart(@RequestBody Cart cart){
        return cartService.add_cart(cart);
    }

    @PutMapping("/add")
    public Cart addSandwichToCart(@RequestBody SandwichOrderIdObject sandwichOrderIdObject) {
        Long sandwichId = sandwichOrderIdObject.getSandwich_id();
        Long cartId = sandwichOrderIdObject.getOrder_id();
        return cartService.addSandwichToCart(sandwichId, cartId);
    }

    @GetMapping
    public List<Cart> get_all_carts(){
        return cartService.get_all_carts();
    }

    @GetMapping("/{id}")
    public Cart get_cart_by_id(@PathVariable("id") long id){
        return cartService.get_cart_by_id(id);
    }

    @PutMapping
    public Cart update_cart(@RequestBody Cart cart){
        return cartService.update_cart(cart);
    }

    @DeleteMapping("/{id_to_delete}")
    public void delete_cart(@PathVariable("id_to_delete") long id){
        cartService.delete_cart(id);
    }

    @GetMapping("/cost/{id}")
    public double get_sum_carts(@PathVariable("id") long id){
        return cartService.sum_cart(id);
    }

}
