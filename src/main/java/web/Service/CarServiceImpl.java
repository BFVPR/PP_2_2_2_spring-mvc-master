package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Entity.Car;
import web.dao.CarDAO;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getCarList();
    }

    @Override
    public List<Car> getSomeAmountOfCars(Integer number) {
        return carDAO.getSomeAmountOfCarList(number);
    }
}
