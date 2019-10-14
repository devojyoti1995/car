package com.example.Car.Service;

import com.example.Car.Model.Car;
import com.example.Car.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
 @Autowired
    CarRepository carRepository;
 public List<Car> getAllCars(){return carRepository.findAll();}

 public void addNewCar(Car car){carRepository.save(car);}

 public void updateCar(Car car) {carRepository.save(car);}

 public void deleteCarDetail(String id) {carRepository.delete(id);}

 public List<Car> avlblCarByCap(String capacity) {
  List<Car> Carlist=carRepository.findAll();
  List<Car> Cars=new ArrayList<>();
  for (Car c:Carlist){
   if(c.getCapacity().equals(capacity)){
    Cars.add(c);
   }
  }
  return Cars;
 }

 public List<String> avlblCarByIsDt(String issuedate) {
  List<Car> CarList=carRepository.findAll();
  List<String> Cars=new ArrayList<>();
  for (Car c: CarList){
   if(c.getBooking().getIssuedate().equals(issuedate)){
    Cars.add(c.getModel());
   }
  }
  return Cars;
 }
}
