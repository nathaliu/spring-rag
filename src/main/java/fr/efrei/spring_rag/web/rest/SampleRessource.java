package fr.efrei.spring_rag.web.rest;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class SampleResource {
    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value) {
        return "Hello " + value + "!";
    }
}