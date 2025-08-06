package com.app.marlonsilvadev.ws_springbootdemo.automaker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.app.marlonsilvadev.ws_springbootdemo.automaker.Engine;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.EngineType;

@Configuration
public class AutomakerConfiguration {

    @Bean(name = "hybridEngine")
    @Primary
    public Engine hybridEngine() {
        var engine = new Engine();
        engine.setPowerOutput(150);
        engine.setFuelEfficiency(15.0);
        engine.setEngineType(EngineType.HYBRID);
        engine.setHorsePower(150);
        engine.setModel("R200");
        return engine;
    }

    @Bean(name = "eletricEngine")
    public Engine eletricEngine() {
        var engine = new Engine();
        engine.setPowerOutput(150);
        engine.setFuelEfficiency(15.0);
        engine.setEngineType(EngineType.ELECTRIC);
        engine.setHorsePower(150);
        engine.setModel("K20C1");
        return engine;
    }

    @Bean(name = "aspiratedEngine")
    public Engine aspiratedEngine() {
        var engine = new Engine();
        engine.setPowerOutput(150);
        engine.setFuelEfficiency(15.0);
        engine.setEngineType(EngineType.ASPIRATED);
        engine.setHorsePower(150);
        engine.setModel("ZORD0Z");
        return engine;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setPowerOutput(150);
        engine.setFuelEfficiency(15.0);
        engine.setEngineType(EngineType.TURBO);
        engine.setHorsePower(150);
        engine.setModel("ZORD0Z");
        return engine;
    }

}
