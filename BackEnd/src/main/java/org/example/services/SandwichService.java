package org.example.services;

import org.example.dao.SandwichRepository;
import org.example.dao.ingredients.*;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins="*")
@Service
public class SandwichService {

    @Autowired
    SandwichRepository sandwichRepository;

    public Sandwich add_sandwich(Sandwich sandwich){
        sandwichRepository.save(sandwich);
        return sandwich;
    }


    public List<Sandwich> get_all_sandwiches(){
        return sandwichRepository.findAll();
    }

    public Sandwich get_sandwich_by_id(Long id){
        return sandwichRepository.findById(id).get();
    }

    public Sandwich update_sandwich(Sandwich sandwich){
        sandwichRepository.save(sandwich);
        return sandwich;
    }

    public void delete_sandwich(long id){
        sandwichRepository.deleteById(id);
    }
}
