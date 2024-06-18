package com.example.demo;

import com.example.demo.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);



//		Pizze p = context.getBean(Pizze.class);
//		System.out.println(p);

//		Menu menu = context.getBean(Menu.class);
//		menu.printMenu();

	}

}
