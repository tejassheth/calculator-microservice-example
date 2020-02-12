package com.example.subtraction.subtractionservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractionController {
    /**
     *
     * @param number1
     * @param number2
     * @return double
     *
     * This method is listen on /sub url with two numbers and it will return
     * subtraction of two numbers
     *
     */

    @GetMapping("/sub/{number1}/{number2}")
    public double sub(@PathVariable double number1,@PathVariable double number2){
        return number1-number2;
    }
}
