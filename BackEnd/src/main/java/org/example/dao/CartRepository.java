package org.example.dao;

import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query(value = "SELECT * FROM sandwich where cart_fk = ?1", nativeQuery = true)
    public List<Sandwich> get_all_sandwiches_by_cart_id(Long cart_id);

//    @Query(value = "SELECT * FROM cart where cart_id = ?1", nativeQuery = true)
//    public Cart get_cart(Long cart_id);

    public List<Cart> findAll();

    public Cart save(Cart cart);
}
