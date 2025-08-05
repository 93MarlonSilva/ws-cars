package com.app.marlonsilvadev.ws_springbootdemo.automaker;

public class Engine {
    private String model;
    private EngineType engineType;
    private Integer horsePower;
    private Automaker automaker;
    private double fuelEfficiency;
    private Integer powerOutput;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public Integer getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(Integer powerOutput) {
        this.powerOutput = powerOutput;
    }

    @Override
    public String toString() {
        return "Engine [model=" + model + ", engineType=" + engineType + ", horsePower=" + horsePower + ", automaker="
                + automaker + ", fuelEfficiency=" + fuelEfficiency + ", powerOutput=" + powerOutput + "]";
    }

}
