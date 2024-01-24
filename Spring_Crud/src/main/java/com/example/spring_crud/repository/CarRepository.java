package com.example.spring_crud.repository;

import com.example.spring_crud.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    List<Car> carList = new ArrayList<Car>();
    public CarRepository(){
        Car car = new Car(1,"honda","xe dep",5155151,"honda",true);
        Car car1 = new Car(2,"honda1","xe dep",5155151,"honda",true);
        Car car2 = new Car(3,"honda2","xe dep",5155151,"honda",true);
        Car car3 = new Car(4,"honda3","xe dep",5155151,"honda",true);

        carList.add(car);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void createCar(Car car) {
        carList.add(car);
    }

    public Car getCarById(int id) {
        for (Car car: carList) {
            if (car.getId() == id) {
                return car;
            }
        }

        return null;
    }

    public void updateCar(Car car) {
        Car carEdit = getCarById(car.getId());
        carEdit.setName(car.getName());
        carEdit.setDetails(car.getDetails());
        carEdit.setPrice(car.getPrice());
        carEdit.setManufacturer(car.getManufacturer());
        carEdit.setStatus(car.isStatus());
    }

    public void deleteCar(int id){
        Car carDelete = getCarById(id);

        carList.remove(carDelete);

    }

    public List<Car> searchByName(String name) {

        List<Car> result = new ArrayList<>();
        for (Car car :carList) {
            if (car.getName().equals(name)) {
                result.add(car);
            }
        }

        return result;
    }
}