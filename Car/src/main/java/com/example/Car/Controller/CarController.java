package com.example.Car.Controller;


import com.example.Car.Model.Car;
import com.example.Car.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/getallcars")
    public List<Car> getAllCars(){return carService.getAllCars();}
    @PostMapping("/addnewcar")
    public void addNewCar(@RequestBody Car car){ carService.addNewCar(car);}
    @PutMapping("/updatenewcar")
    public void updateCarDetails(@RequestBody Car car){carService.updateCar(car);}
    @DeleteMapping("/deletecardetails/{id}")
    public void deleteCarDetails(@PathVariable ("id") String id){carService.deleteCarDetail(id);}
    @GetMapping("/availablecar/{capacity}")
    public List<Car> avlblCarByCap(@PathVariable ("capacity") String capacity){return carService.avlblCarByCap(capacity);}
    @GetMapping("availablecar/{issuedate}")
    public List<String> avlblCarByIsDt(@PathVariable ("issuedate") String issuedate){return carService.avlblCarByIsDt(issuedate);}

}
