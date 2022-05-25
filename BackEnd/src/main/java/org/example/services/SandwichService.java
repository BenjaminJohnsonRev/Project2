package org.example.services;

import org.example.dao.SandwichRepository;
import org.example.entity.menu.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService {

    @Autowired
    SandwichRepository sandwichRepository;

    public Sandwich add_sandwich(Sandwich sandwich){
        sandwichRepository.save(sandwich);
        return sandwich;
    }


    public List<Sandwich> get_all_sandwiches(){
<<<<<<< HEAD
//        Sandwich sandwich1 = new Sandwich(1l, 1l, 1l, 1l, 1l , 1l);
//        Sandwich sandwich2 = new Sandwich(2l, 2l, 2l, 2l, 2l , 2l);
//        Sandwich sandwich3 = new Sandwich(3l, 3l, 3l, 3l, 3l , 3l);

//        List<Sandwich> sandwiches = new ArrayList<>();
//        sandwiches.add(sandwich1);
//        sandwiches.add(sandwich2);
//        sandwiches.add(sandwich3);

=======
>>>>>>> d87d450d11cba95554d9fd7c98c5b849fc4e22b8
        return sandwichRepository.findAll();
    }

    public Sandwich get_sandwich_by_id(Long id){
        return sandwichRepository.get_sandwich_by_id(id);
    }

    public Sandwich update_sandwich(Sandwich sandwich, Long id){
<<<<<<< HEAD
        System.out.println("Updating sandwich with id: " + id);
        System.out.println(sandwich);
        return sandwichRepository.save(sandwich);
=======
        sandwichRepository.save(sandwich);
        return sandwich;
>>>>>>> d87d450d11cba95554d9fd7c98c5b849fc4e22b8
    }

    public void delete_sandwich(long id){
        sandwichRepository.deleteById(id);
    }
}
