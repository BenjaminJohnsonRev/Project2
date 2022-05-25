package org.example.services;

import org.example.dao.SandwichRepository;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichService {

    @Autowired
    SandwichRepository sandwichRepository;

    public Sandwich add_sandwich(Sandwich sandwich){
        System.out.println("Sandwich: " + sandwich.toString());
        return sandwich;
    }


    public List<Sandwich> get_all_sandwiches(){
//        Sandwich sandwich1 = new Sandwich(1l, 1l, 1l, 1l, 1l , 1l);
//        Sandwich sandwich2 = new Sandwich(2l, 2l, 2l, 2l, 2l , 2l);
//        Sandwich sandwich3 = new Sandwich(3l, 3l, 3l, 3l, 3l , 3l);

//        List<Sandwich> sandwiches = new ArrayList<>();
//        sandwiches.add(sandwich1);
//        sandwiches.add(sandwich2);
//        sandwiches.add(sandwich3);

        return sandwichRepository.findAll();
    }

    public Sandwich get_sandwich_by_id(Long id){
        System.out.println("passed in id: " + id);


        return sandwichRepository.get_sandwich_by_id(id);
    }

    public Sandwich update_sandwich(Sandwich sandwich, Long id){
        System.out.println("Updating sandwich with id: " + id);
        System.out.println(sandwich);
        return sandwichRepository.save(sandwich);
    }

    public void delete_sandwich(Long id){
        System.out.println("Deleting sandwich with id: " + id);

    }
}
