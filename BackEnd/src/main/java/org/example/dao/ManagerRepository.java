package org.example.dao;

import org.example.entity.Customer;
import org.example.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Optional<Manager> getByUsernameAndPassword(String username, String password);

}
