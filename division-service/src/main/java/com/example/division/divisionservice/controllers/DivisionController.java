package com.example.division.divisionservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {
    /**
     *
     * @param number1
     * @param number2
     * @return double
     *
     * This method is listen on /div url with two numbers and it will return
     * division of two numbers
     */
    @GetMapping("/div/{number1}/{number2}")
    public double divide(@PathVariable double number1,@PathVariable double number2){
        return number1/number2;
    }
}
