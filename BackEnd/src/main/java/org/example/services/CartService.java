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
<<<<<<< HEAD

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
=======
        return cartRepository.findAll();
    }

    public Cart get_cart_by_id(Long id){
        return cartRepository.getById(id);
    }

    public Cart update_cart(Cart cart){
        cartRepository.save(cart);
        return cart;
>>>>>>> d87d450d11cba95554d9fd7c98c5b849fc4e22b8
    }

    public void delete_cart(Long id){
        cartRepository.deleteById(id);
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
