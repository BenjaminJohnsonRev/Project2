package org.example.services;

import org.example.dao.CartRepository;
import org.example.dao.SandwichRepository;
import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@CrossOrigin(origins="*")
@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    SandwichRepository sandwichRepository;

    public Cart add_cart(Cart cart){
        cartRepository.save(cart);
        return cart;
    }

    public List<Cart> get_all_carts(){
        return cartRepository.findAll();
    }

    public List<Cart> get_all_carts_by_customer_id(long id) {return cartRepository.getAllByCustomer_id(id);}

    public List<Cart> get_all_carts_by_employee_id(long id) {return cartRepository.getAllByEmployee_id(id);}

    public List<Cart> get_all_carts_by_date(Date time) {return cartRepository.getAllByDate(time);}


    public Cart get_cart_by_id(Long id){
        return cartRepository.findById(id).get();
    }

    public Cart update_cart(Cart cart){
        cartRepository.save(cart);
        return cart;
    }

    public void delete_cart(Long id){
        cartRepository.deleteById(id);
    }

    public Cart sum_cart(Long id){
        double sum = 0;
        Cart cart = cartRepository.findById(id).get();
        Set<Sandwich> sandwiches = cart.getSandwiches();
        for (Sandwich sandwich: sandwiches) {
            sum += sandwich.getBread().getPrice();
            sum += sandwich.getMeat().getPrice();
            sum += sandwich.getSauce().getPrice();
            sum += sandwich.getSeasoning().getPrice();
            sum += sandwich.getVegetable().getPrice();
        }
        cartRepository.findById(id).get().setCost_sum(sum);
        return cart;
    }

    public Cart add_sandwich_to_cart(long sandwich_id, long cart_id){
        Cart cart = cartRepository.findById(cart_id).get();
        Sandwich sandwich = sandwichRepository.findById(sandwich_id).get();
        cart.addSandwich(sandwich);
        cartRepository.save(cart);
        return cart;
    }

    public Cart remove_sandwich_to_cart(long sandwich_id, long cart_id){
        Cart cart = cartRepository.findById(cart_id).get();
        Sandwich sandwich = sandwichRepository.get_sandwich_by_id(sandwich_id);
        cart.removeSandwich(sandwich);
        cartRepository.save(cart);
        return cart;
    }
}
