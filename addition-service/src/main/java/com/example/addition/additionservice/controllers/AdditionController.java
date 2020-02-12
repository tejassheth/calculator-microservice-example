package com.example.addition.additionservice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    /**
     *
     * @param number1
     * @param number2
     * @return double
     * This method is listen on /add url with two numbers and it will return
     * sum of two numbers
     *
     */
    @PostMapping("/add/{number1}/{number2}")
    public double add(@PathVariable double number1,@PathVariable double number2){
        return Double.sum(number1,number2);
    }
}
