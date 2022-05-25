package org.example.services;

import org.example.dao.CartRepository;
import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart add_cart(Cart cart){
        cartRepository.save(cart);
        return cart;
    }

    public List<Cart> get_all_carts(){
        return cartRepository.findAll();
    }

    public Cart get_cart_by_id(Long id){
        return cartRepository.getById(id);
    }

    public Cart update_cart(Cart cart){
        cartRepository.save(cart);
        return cart;
    }

    public void delete_cart(Long id){
        cartRepository.deleteById(id);
    }

    public List<Sandwich> get_all_sandwiches_by_cart_id (Long id){
        return cartRepository.get_all_sandwich_by_cart_id(id);
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
        cartRepository.getById(id).setCost_sum(sum);
        return sum;
    }
}
