package br.com.ebac.ebaczookeeperserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class olaMundoController {
    @GetMapping("/hellworld")
    public String olaMundo(){
        return "Hello, World!";

    }
}
