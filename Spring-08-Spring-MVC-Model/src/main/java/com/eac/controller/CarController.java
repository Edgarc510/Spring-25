package com.eac.controller;

import com.eac.enums.Gender;
import com.eac.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {


    @RequestMapping("/info")
    public String car(@RequestParam String make,@RequestParam Integer year, Model model){
    ////localhost:8080/car/info?make=Honda&year=2015
        model.addAttribute("make", make);
        model.addAttribute("year", year);

        System.out.println(make);
        return "car/car-info";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Audi")String make, Model model){
        ////http://localhost:8080/car/info2
        model.addAttribute("make", make);


        System.out.println(make);
        return "car/car-info";
    }
    @RequestMapping("/info/{make}/{year}")
    public String getCarInfo(@PathVariable String make, @PathVariable String year, Model model){
        ////http://localhost:8080/car/info/
        model.addAttribute("make", make);
        model.addAttribute("year", year);


        System.out.println(make);
        return "car/car-info";
    }


}
