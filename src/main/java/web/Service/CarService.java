package web.Service;

import web.Entity.Car;

import java.util.List;

public interface CarService {

    public List<Car> getAllCars();


    public List<Car> getSomeAmountOfCars(Integer number);

}
