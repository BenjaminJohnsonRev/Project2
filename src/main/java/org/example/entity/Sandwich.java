package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Sandwich {
    private long sandwich_id;
    private long order_id;
    private long bread_id;
    private long meat_id;
    private long vegetable_id;
    private long sauce_id;
    private long seasoning_id;

    public Sandwich(long order_id, long bread_id, long meat_id, long vegetable_id, long sauce_id, long seasoning_id) {
        this.order_id = order_id;
        this.bread_id = bread_id;
        this.meat_id = meat_id;
        this.vegetable_id = vegetable_id;
        this.sauce_id = sauce_id;
        this.seasoning_id = seasoning_id;
    }
}