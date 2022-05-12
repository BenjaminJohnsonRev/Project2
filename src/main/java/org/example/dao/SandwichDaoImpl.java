package com.megabites.data;

import com.megabites.entity.Sandwich;

import java.sql.ResultSet;
import java.util.List;

public class SandwichDaoImpl implements SandwichDao{
    @Override
    public void insert(Sandwich sandwich) {

    }

    @Override
    public Sandwich update(Sandwich sandwich) {
        return null;
    }

    @Override
    public boolean delete(int idData) {
        return false;
    }

    @Override
    public Sandwich getSandwich(ResultSet resultSet) {
        return null;
    }

    @Override
    public Sandwich getSandwichById(int idData) {
        return null;
    }

    @Override
    public List<Sandwich> getAllSandwiches() {
        return null;
    }
}
