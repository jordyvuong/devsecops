package com.example.Devops;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ServiceWeb {
    @GetMapping("/cars")
    public Car cars(){
        Car car = new Car("AA11BB", "Maserati", 2000);
        return car;
    }
}