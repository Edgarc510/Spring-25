package com.eac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
//Auto Wire
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Edgar");
//        p.setCar(car()); //Direct Wiring(Created relationship between objects); calling annotated method from another @Bean annotated method
//        return p;
//    }

    //AutoWiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Edgar");
        p.setCar(car); //Direct Wiring(Created relationship between objects); calling annotated method from another @Bean annotated method
        return p;
    }


}
