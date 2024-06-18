package com.example.demo.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public abstract class MenuItem {
    protected long id;
    protected int calorie;
    protected double prezzo;


    public MenuItem(int calorie, double prezzo) {
        Random rnd = new Random();
        this.id = rnd.nextLong();
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

}
