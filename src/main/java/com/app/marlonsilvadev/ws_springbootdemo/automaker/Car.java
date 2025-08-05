package com.app.marlonsilvadev.ws_springbootdemo.automaker;

import java.awt.Color;

public class Car {
    private String model;
    private Color color;
    private Engine engine;
    private Automaker automaker;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public CarStatus darIgnition(CarKey key) {

        if (key.getAutomaker() != this.automaker) {
            return new CarStatus("Key does not match the car's automaker.");
        }

        return new CarStatus("Car started successfully with key: " + engine);
    }
}
