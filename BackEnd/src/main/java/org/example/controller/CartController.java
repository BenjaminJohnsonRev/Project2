package org.example.controller;


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

    @GetMapping
    public List<Cart> get_all_carts(){
        return cartService.get_all_carts();
    }

    @GetMapping("/{id}")
    public Cart get_cart_by_id(@PathVariable("id") long id){
        return cartService.get_cart(id);
    }

<<<<<<< HEAD
//    @GetMapping("/get/sandwiches/{id}")
//    public List<Sandwich> get_all_sandwiches_by_cart_id(@PathVariable("id") long id) {return cartService.get_all_sandwiches_by_cart_id(id);}

    @PutMapping("/update/{id}")
=======
    @PutMapping
>>>>>>> d87d450d11cba95554d9fd7c98c5b849fc4e22b8
    public Cart update_cart(@RequestBody Cart cart){
        return cartService.update_cart(cart);
    }

    @DeleteMapping("/{id_to_delete}")
    public void delete_cart(@PathVariable("id_to_delete") long id){
        cartService.delete_cart(id);
    }

<<<<<<< HEAD
    @GetMapping("/cost/{id}")
=======
    @GetMapping("/cost/{id}}")
>>>>>>> d87d450d11cba95554d9fd7c98c5b849fc4e22b8
    public double get_sum_carts(@PathVariable("id") long id){
        return cartService.sum_cart(id);
    }

}
