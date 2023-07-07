package com.ap.springopa.demo.springbootopademo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
public class HelloWorldRestController {

    @GetMapping(path = "/greeting")
    public Mono<String> getMessage() {
        return Mono.just("Hello World Demo of Springboot, OPA and Auth0");
    }
}
