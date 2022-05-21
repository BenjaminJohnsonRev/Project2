package com.megabites.service;
import com.megabites.entity.Sandwich;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichService {

    public Sandwich add_sandwich(Sandwich sandwich){
        System.out.println("Sandwich: " + sandwich.toString());
        return sandwich;
    }

    public List<Sandwich> get_all_sandwiches(){
        Sandwich sandwich1 = new Sandwich(1l, 1l, 1l, 1l, 1l , 1l);
        Sandwich sandwich2 = new Sandwich(2l, 2l, 2l, 2l, 2l , 2l);
        Sandwich sandwich3 = new Sandwich(3l, 3l, 3l, 3l, 3l , 3l);

        List<Sandwich> sandwiches = new ArrayList<>();
        sandwiches.add(sandwich1);
        sandwiches.add(sandwich2);
        sandwiches.add(sandwich3);

        return sandwiches;
    }

    public Sandwich get_sandwich_by_id(Long id){
        System.out.println("passed in id: " + id);

        return new Sandwich(id, 1l, 1l, 1l, 1l, 1l);
    }

    public Sandwich update_sandwich(Sandwich sandwich, Long id){
        System.out.println("Updating sandwich with id: " + id);
        System.out.println(sandwich);
        return sandwich;
    }

    public void delete_sandwich(Long id){
        System.out.println("Deleting sandwich with id: " + id);

    }
}
