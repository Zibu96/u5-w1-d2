package com.example.demo.entities;

import com.example.demo.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int numero;
    private int coperti;
    private StatoTavolo statoTavolo;

}
