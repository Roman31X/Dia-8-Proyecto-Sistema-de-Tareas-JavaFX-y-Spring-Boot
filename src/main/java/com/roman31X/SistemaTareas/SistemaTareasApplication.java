package com.roman31X.SistemaTareas;

import com.roman31X.SistemaTareas.view.SistemaTareaFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaTareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SistemaTareasApplication.class, args);
		Application.launch(SistemaTareaFx.class,args);
	}

}
