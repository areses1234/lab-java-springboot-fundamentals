package com.ironhack.alexardelean.helloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloClass {
    @GetMapping("/hello")
    public String hello() {
        return "Hello !";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + " !";
    }

    @GetMapping("/add/{number1}/{number2}")
    public String add(@PathVariable int number1, @PathVariable int number2){
        return "Sum of two numbers is = "+(number1 + number2);

    }

    @GetMapping("/multiply/{number1}/{number2}")
    public String multiply(@PathVariable int number1, @PathVariable int number2){
        return "Product of two numbers is = "+(number1 * number2);
    }
}

