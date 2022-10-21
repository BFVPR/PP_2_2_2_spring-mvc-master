package web.dao;

import org.springframework.stereotype.Repository;
import web.Entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(0, "Toyota Camry", 2012, "black"));
        carList.add(new Car(1, "Volvo V90", 2019, "black"));
        carList.add(new Car(2, "Audi TT", 2007, "red"));
        carList.add(new Car(3, "VW Passat CC", 2012, "white"));
        carList.add(new Car(4, "Ford Focus", 2014, "blue"));
    }
    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getSomeAmountOfCarList(Integer number) {
//        return carList.stream().filter(car -> car.getIndex() < number).collect(Collectors.toList());
        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
