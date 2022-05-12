package com.megabites.data;

import com.megabites.entity.Sandwich;

import java.sql.ResultSet;
import java.util.List;

public interface SandwichDao {
    public void insert(Sandwich sandwich);
    public Sandwich update(Sandwich sandwich);
    public boolean delete(int idData);
    public Sandwich getSandwich(ResultSet resultSet);
    public Sandwich getSandwichById(int idData);
    public List<Sandwich> getAllSandwiches();
}
