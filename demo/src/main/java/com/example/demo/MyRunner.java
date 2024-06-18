package com.example.demo;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Ordine ordine;
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);

        System.out.println("CIAO DAL RUNNER");
        Menu menu = context.getBean(Menu.class);
        menu.printMenu();

        System.out.println(ordine);



    }
}