package com.example.project2.entity.menu;


import com.example.project2.entity.menu.ingredients.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Sandwich {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long sandwich_id;
    @ManyToOne
    @JoinColumn(name = "bread_id")
    private Bread bread;
    @ManyToOne
    @JoinColumn(name = "meat_id")
    private Meat meat;
    @ManyToOne
    @JoinColumn(name = "vegetable_id")
    private Vegetable vegetable;
    @ManyToOne
    @JoinColumn(name = "sauce_id")
    private Sauce sauce;
    @ManyToOne
    @JoinColumn(name = "seasoning_id")
    private Seasoning seasoning;
    //private long price;


    public Sandwich(Bread bread, Meat meat, Vegetable vegetable, Sauce sauce, Seasoning seasoning) {
        this.bread = bread;
        this.meat = meat;
        this.vegetable = vegetable;
        this.sauce = sauce;
        this.seasoning = seasoning;
    }
}