package com.example.demo.entities;

import com.example.demo.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
@Getter
@Setter

public class Ordine {
    private List<MenuItem> menuItems;
    private int numero;
    private StatoOrdine statoOrdine;
    private int tavolo;
    private LocalDateTime orario;
    private double importo;


    @Autowired
    public Ordine(@Qualifier("menuToUse") List<MenuItem> menuItems,  Tavolo tavolo, @Qualifier("importo") double importo ) {



            this.menuItems = menuItems;
            this.numero = 1;
            this.statoOrdine = StatoOrdine.PRONTO;
            this.orario= LocalDateTime.now();
            this.tavolo= tavolo.getNumero();
            this.importo= importo;


    }

    @Override
    public String toString() {
        return "Ordine{" +
                "menu=" + menuItems +
                ", numero=" + numero +
                ", statoOrdine=" + statoOrdine +
                ", tavolo=" + tavolo +
                ", orario=" + orario +
                ", importo=" + importo +
                '}';
    }
}
