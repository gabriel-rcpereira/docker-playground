package com.grcp.serviceone;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello");
    }
}
