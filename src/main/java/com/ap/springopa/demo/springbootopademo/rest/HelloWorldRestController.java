package com.ap.springopa.demo.springbootopademo.rest;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
public class HelloWorldRestController {

    @GetMapping(path = "/greeting")
    public Mono<String> getMessage() {
        return Mono.just("Hello World Demo of Springboot, OPA and Auth0");
    }

    @PutMapping(path = "/update-greeting/{name}")
    public Mono<String> updateMessage(@PathVariable String name) {
        return Mono.just("Hello " +name);
    }
}
