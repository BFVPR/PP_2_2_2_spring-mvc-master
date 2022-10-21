package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;


@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }

//    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
//        if (count == null | count >= 5) {
//            model.addAttribute("cars", carService.getAllCars());
//        } else {
//            model.addAttribute("cars", carService.getSomeAmountOfCars(count));
//        }
//        return "cars";
//    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getSomeAmountOfCars(count));
        return "cars";
    }

}
