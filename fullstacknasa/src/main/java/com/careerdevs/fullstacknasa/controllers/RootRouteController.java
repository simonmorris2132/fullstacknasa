package com.careerdevs.fullstacknasa.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootRouteController {
    
    @GetMapping
    public ResponseEntity<String> rootRoute() {
        return ResponseEntity.ok("Hello!");
    }

}
