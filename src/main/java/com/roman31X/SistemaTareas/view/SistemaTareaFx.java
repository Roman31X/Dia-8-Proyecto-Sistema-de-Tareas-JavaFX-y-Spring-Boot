package com.roman31X.SistemaTareas.view;

import com.roman31X.SistemaTareas.SistemaTareasApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SistemaTareaFx extends Application {

    private ConfigurableApplicationContext applicationContext;

    /*
    public static void main(String[] args) {
        launch(args);
    }*/

    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(SistemaTareasApplication.class).run();
    }

    @Override
    public void start(Stage stage) {

    }
}
