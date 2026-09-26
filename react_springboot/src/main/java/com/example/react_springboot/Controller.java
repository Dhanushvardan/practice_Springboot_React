package com.example.react_springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Serv service;

    public Controller(Serv service) {
        this.service = service;
    }

    @PutMapping("/addEntity")
    public Entity addEntity(@RequestBody Entity entity) {
        
        return service.saveEntity(entity);
    }

    @GetMapping("/getNameById")
    public String getNameById(@RequestBody Integer id) {
        return service.findNameById(id);
    }

}
