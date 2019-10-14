package com.example.Car.Repository;

import com.example.Car.Model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car,String> {
}
