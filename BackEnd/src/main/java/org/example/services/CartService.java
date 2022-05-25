package org.example.services;

import org.example.dao.CartRepository;
import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart add_cart(Cart cart){
        System.out.println("cart: " + cart.toString());
        return cart;
    }

    public List<Cart> get_all_carts(){

        return cartRepository.findAll();
    }



    public Cart get_cart(Long id){
        System.out.println("passed in id: " + id);

        return cartRepository.findById(id).get();
    }

    public Cart update_cart(Cart cart){
        System.out.println("Updating cart with id: " + cart.getCart_id());
        System.out.println(cart);
        return cartRepository.save(cart);
    }

    public void delete_cart(Long id){
        System.out.println("Deleting cart with id: " + id);
    }

    public double sum_cart(Long id){
        double sum = 0;
        Cart cart = cartRepository.getById(id);
        Set<Sandwich> sandwiches = cart.getSandwiches();
        for (Sandwich sandwich: sandwiches) {
            sum += sandwich.getBread().getPrice();
            sum += sandwich.getMeat().getPrice();
            sum += sandwich.getSauce().getPrice();
            sum += sandwich.getSeasoning().getPrice();
            sum += sandwich.getVegetable().getPrice();
        }
        return sum;
    }
}
