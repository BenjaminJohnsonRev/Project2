package com.example.project2.services;

import com.example.project2.data.CartRepository;
import com.example.project2.entity.Cart;
import com.example.project2.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart add_cart(Cart cart){
        System.out.println("cart: " + cart.toString());
        return cart;
    }

    public List<Cart> get_all_carts(){
        Cart cart1 = new Cart(1l, 1l, 10, new Timestamp(System.currentTimeMillis()));
        Cart cart2 = new Cart(2l, 1l, 10, new Timestamp(System.currentTimeMillis()));
        Cart cart3 = new Cart(3l, 1l, 10, new Timestamp(System.currentTimeMillis()));

        List<Cart> carts = new ArrayList<>();
        carts.add(cart1);
        carts.add(cart2);
        carts.add(cart3);

        return carts;
    }

    public Cart get_cart_by_id(Long id){
        System.out.println("passed in id: " + id);

        return new Cart(1l, 1l, 10, new Timestamp(System.currentTimeMillis()));
    }

    public Cart update_cart(Cart cart, Long id){
        System.out.println("Updating cart with id: " + id);
        System.out.println(cart);
        return cart;
    }

    public void delete_cart(Long id){
        System.out.println("Deleting cart with id: " + id);
    }

    public List<Sandwich> get_all_sandwiches_by_cart_id (Long id){
        return cartRepository.get_all_sandwich_by_cart_id(id);
    }

    public double sum_cart(Long id){
        double sum = 0;
        List<Sandwich> sandwiches = get_all_sandwiches_by_cart_id(id);
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
