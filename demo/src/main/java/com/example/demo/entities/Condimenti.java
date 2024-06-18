package com.example.demo.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Condimenti extends MenuItem {
    private String condimentiName;


    public Condimenti(int calorie, double prezzo, String condimentiName) {
        super(calorie, prezzo);
        this.condimentiName = condimentiName;
    }


    @Override
    public String toString() {
        return "Condimenti{" +
                "condimentiName='" + condimentiName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
