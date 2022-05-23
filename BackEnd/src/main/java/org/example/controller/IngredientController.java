package org.example.controller;

import org.example.entity.menu.ingredients.*;
import org.example.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    @Autowired
    IngredientService ingredientService;

    @PostMapping("/bread")
    public Bread add_bread(@RequestBody Bread bread) {return ingredientService.add_bread(bread);}

    @GetMapping("/bread/{id}")
    public Bread get_bread(@PathVariable("id") long id){return ingredientService.get_bread_by_id(id);}

    @PutMapping("/bread")
    public Bread update_bread(@RequestBody Bread bread) {return ingredientService.update_bread(bread);}

    @DeleteMapping("/bread/{id}")
    public void delete_bread(@PathVariable("id") long id) {ingredientService.delete_bread(id);}

    //
    @PostMapping("/meat")
    public Meat add_meat(@RequestBody Meat meat) {return ingredientService.add_meat(meat);}

    @GetMapping("/meat/{id}")
    public Meat get_meat(@PathVariable("id") Long id){return ingredientService.get_meat_by_id(id);}

    @PutMapping("/meat")
    public Meat update_meat(@RequestBody Meat meat) {return ingredientService.update_meat(meat);}

    @DeleteMapping("/meat/{id}")
    public void delete_meat(@PathVariable("id") Long id) {ingredientService.delete_meat(id);}

    //
    @PostMapping("/sauce")
    public Sauce add_sauce(@RequestBody Sauce sauce) {return ingredientService.add_sauce(sauce);}

    @GetMapping("/sauce/{id}")
    public Sauce get_sauce(@PathVariable("id") Long id){return ingredientService.get_sauce_by_id(id);}

    @PutMapping("/sauce")
    public Sauce update_sauce(@RequestBody Sauce sauce) {return ingredientService.update_sauce(sauce);}

    @DeleteMapping("/sauce/{id}")
    public void delete_sauce(@PathVariable("id") Long id) {ingredientService.delete_sauce(id);}

    //
    @PostMapping("/seasoning")
    public Seasoning add_seasoning(@RequestBody Seasoning seasoning) {return ingredientService.add_seasoning(seasoning);}

    @GetMapping("/seasoning/{id}")
    public Seasoning get_seasoning(@PathVariable("id") Long id){return ingredientService.get_seasoning_by_id(id);}

    @PutMapping("/seasoning")
    public Seasoning update_seasoning(@RequestBody Seasoning seasoning) {return ingredientService.update_seasoning(seasoning);}

    @DeleteMapping("/seasoning/{id}")
    public void delete_seasoning(@PathVariable("id") Long id) {ingredientService.delete_seasoning(id);}

    //
    @PostMapping("/vegetable")
    public Vegetable add_vegetable(@RequestBody Vegetable vegetable) {return ingredientService.add_vegetable(vegetable);}

    @GetMapping("/vegetable/{id}")
    public Vegetable get_vegetable(@PathVariable("id") Long id){return ingredientService.get_vegetable_by_id(id);}

    @PutMapping("/vegetable")
    public Vegetable update_vegetable(@RequestBody Vegetable vegetable) {return ingredientService.update_vegetable(vegetable);}

    @DeleteMapping("/vegetable/{id}")
    public void delete_vegetable(@PathVariable("id") Long id) {ingredientService.delete_vegetable(id);}
}
