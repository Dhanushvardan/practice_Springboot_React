package com.example.react_springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class Controller {

    private final Serv service;

    public Controller(Serv service) {
        this.service = service;
    }

    @PostMapping("/addEntity")
    public Entity addEntity(@RequestBody Entity entity) {

        return service.saveEntity(entity);
    }

    @GetMapping("/getNameById/{id}")
    public String getNameById(@PathVariable Integer id) {
        return service.findNameById(id);
    }

}
