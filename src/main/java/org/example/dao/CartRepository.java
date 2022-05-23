package org.example.dao;

import org.example.entity.Cart;
import org.example.entity.menu.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query(value = "SELECT * FROM sandwich where cart_fk = ?1", nativeQuery = true)
    public List<Sandwich> get_all_sandwich_by_cart_id(Long cart_id);
}
