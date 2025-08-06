package com.app.marlonsilvadev.ws_springbootdemo.automaker.api;

import org.springframework.web.bind.annotation.RestController;

import com.app.marlonsilvadev.ws_springbootdemo.automaker.CarKey;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.CarStatus;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.Engine;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.HondaHRV;
import com.app.marlonsilvadev.ws_springbootdemo.automaker.api.annotations.TurboEngine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cars")
public class TesterFactoryController {

    @Autowired
    @TurboEngine
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody CarKey carkey) {
        var car = new HondaHRV(engine);
        return car.darIgnition(carkey);
    }
}
