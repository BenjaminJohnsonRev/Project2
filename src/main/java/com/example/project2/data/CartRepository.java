package com.example.project2.data;

import com.example.project2.entity.Cart;
import com.example.project2.entity.menu.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query(value = "SELECT * FROM sandwich where cart_fk = ?1", nativeQuery = true)
    public List<Sandwich> get_all_sandwich_by_cart_id(Long cart_id);
}
