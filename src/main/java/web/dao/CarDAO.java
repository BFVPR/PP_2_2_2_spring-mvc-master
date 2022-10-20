package web.dao;

import web.Entity.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getCarList();


    public List<Car> getSomeAmountOfCarList(int number);
}
