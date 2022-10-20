package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;


@Controller
public class CarController {

    private final CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

//    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
//        if (count == null | count >= 5) {
//            model.addAttribute("cars", carServiceImpl.getAllCars());
//        } else {
//            model.addAttribute("cars", carServiceImpl.getSomeAmountOfCars(count));
//        }
//        return "cars";
//    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carServiceImpl.getSomeAmountOfCars(count));
        return "cars";
    }
}
