package com.example.multiplication.multiplicationservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {
    /**
     *
     * @param number1
     * @param number2
     * @return double
     *  This method is listen on /mul url with two numbers and it will return
     *  multiplication of two numbers
     *
     */
    @GetMapping("/mul/{number1}/{number2}")
    public double multiply(@PathVariable double number1,@PathVariable double number2){
        return number1*number2;
    }
}
