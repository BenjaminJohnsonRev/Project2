package org.example.services;


import org.example.dao.*;
import org.example.entity.menu.ingredients.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
    @Autowired
    BreadRepository breadRepository;

    @Autowired
    MeatRepository meatRepository;

    @Autowired
    SauceRepository sauceRepository;

    @Autowired
    SeasoningRepository seasoningRepository;

    @Autowired
    VegetableRepository vegetableRepository;

    public Bread add_bread(Bread bread) {
        breadRepository.save(bread);
        return bread;
    }

    public Bread get_bread_by_id(long id) {return breadRepository.findByBreadId(id);}

    public Bread update_bread(Bread bread) {
        breadRepository.save(bread);
        return bread;
    }

    public void delete_bread(long id) {breadRepository.deleteById(id);}

    //
    public Meat add_meat(Meat meat) {
        meatRepository.save(meat);
        return meat;
    }

    public Meat get_meat_by_id(Long id) {return meatRepository.findByMeat_id(id);}

    public Meat update_meat(Meat meat) {
        meatRepository.save(meat);
        return meat;
    }

    public void delete_meat(Long id) {meatRepository.deleteById(id);}

    //
    public Sauce add_sauce(Sauce sauce) {
        sauceRepository.save(sauce);
        return sauce;
    }

    public Sauce get_sauce_by_id(Long id) {return sauceRepository.findBySauce_id(id);}

    public Sauce update_sauce(Sauce sauce) {
        sauceRepository.save(sauce);
        return sauce;
    }

    public void delete_sauce(Long id) {sauceRepository.deleteById(id);}

    //
    public Seasoning add_seasoning(Seasoning seasoning) {
        seasoningRepository.save(seasoning);
        return seasoning;
    }

    public Seasoning get_seasoning_by_id(Long id) {return seasoningRepository.findBySeasoning_id(id);}

    public Seasoning update_seasoning(Seasoning seasoning) {
        seasoningRepository.save(seasoning);
        return seasoning;
    }

    public void delete_seasoning(Long id) {seasoningRepository.deleteById(id);}


    //
    public Vegetable add_vegetable(Vegetable vegetable) {
        vegetableRepository.save(vegetable);
        return vegetable;
    }

    public Vegetable get_vegetable_by_id(Long id) {return vegetableRepository.findByVegetable_id(id);}

    public Vegetable update_vegetable(Vegetable vegetable) {
        vegetableRepository.save(vegetable);
        return vegetable;
    }

    public void delete_vegetable(Long id) {vegetableRepository.deleteById(id);}


}
