package com.app.marlonsilvadev.ws_springbootdemo.automaker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.marlonsilvadev.ws_springbootdemo.automaker.Automaker;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.Engine;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.EngineType;

@Configuration
public class AutomakerConfiguration {

    @Bean
    public Engine engine() {
        var engine = new Engine();
        engine.setAutomaker(Automaker.HONDA);
        engine.setPowerOutput(150);
        engine.setFuelEfficiency(15.0);
        engine.setEngineType(EngineType.HYBRID);
        engine.setHorsePower(150);
        engine.setModel("K20C1");
        return engine;
    }

}
