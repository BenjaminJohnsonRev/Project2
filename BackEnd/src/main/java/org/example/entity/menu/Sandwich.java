package org.example.entity.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.entity.menu.ingredients.*;

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
    private long cart_fk;



    public Sandwich(Bread bread, Meat meat, Vegetable vegetable, Sauce sauce, Seasoning seasoning) {
        this.bread = bread;
        this.meat = meat;
        this.vegetable = vegetable;
        this.sauce = sauce;
        this.seasoning = seasoning;
    }

    public Sandwich(long sandwich_id, Bread bread, Meat meat, Vegetable vegetable, Sauce sauce, Seasoning seasoning) {
        this.sandwich_id = sandwich_id;
        this.bread = bread;
        this.meat = meat;
        this.vegetable = vegetable;
        this.sauce = sauce;
        this.seasoning = seasoning;
    }
}