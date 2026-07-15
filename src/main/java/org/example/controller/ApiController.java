package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Service is running");
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<String> getItem(@PathVariable String id) {
        return ResponseEntity.ok("Item: " + id);
    }

    @PostMapping("/items")
    public ResponseEntity<String> createItem(@RequestBody String item) {
        return ResponseEntity.ok("Created: " + item);
    }
}
