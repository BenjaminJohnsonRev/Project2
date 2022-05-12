package com.megabites.controller;

import com.megabites.entity.Sandwich;
import com.megabites.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sandwiches")
public class SandwichController {
    @Autowired
    SandwichService sandwichService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Sandwich add_sandwich(@RequestBody Sandwich sandwich){
        return sandwichService.add_sandwich(sandwich);
    }

    @GetMapping("/get")
    public List<Sandwich> get_all_sandwiches(){
        return sandwichService.get_all_sandwiches();
    }

    @GetMapping("/get/{id}")
    public Sandwich get_sandwich_by_id(@PathVariable("id") long id){
        return sandwichService.get_sandwich_by_id(id);
    }

    @PutMapping("/update/{id}")
    public Sandwich update_sandwich(@RequestBody Sandwich sandwich, @PathVariable("id") long id){
        return sandwichService.update_sandwich(sandwich, id);
    }

    @DeleteMapping("/delete/{id_to_delete}")
    public void delete_sandwich(@PathVariable("id_to_delete") Long id){
        sandwichService.delete_sandwich(id);
    }

}
