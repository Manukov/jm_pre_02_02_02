package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @GetMapping("/cars")
//    public String startPage(Model model) {
//
//        List<Car> cars = carService.listCars();
//        model.addAttribute("listCars", cars);
//        return "cars";
//    }


    @GetMapping("/cars")
    public String ShowId(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.listCars(count);
        model.addAttribute("listCars", cars);
        return "cars";
    }
}
