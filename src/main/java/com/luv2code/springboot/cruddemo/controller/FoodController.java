package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Food;
import com.luv2code.springboot.cruddemo.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/food")
public class FoodController {
    private FoodService foodService;

    public FoodController(FoodService theFoodService){
        foodService = theFoodService;
    }

    @GetMapping("/test")
    @ResponseBody
    public String getTest(Model theModel){
        List<Food> theFood = foodService.findAll();

        theModel.addAttribute("food",theFood);

        return theFood.toString();
    }

    @PostMapping ("/addFood")
    @ResponseBody
    public String addFood(@RequestParam("food_name") String foodName, @RequestParam("weight") int weight){
        Food newFood = new Food();

        newFood.setFood_name(foodName);
        newFood.setWeight(weight);

        foodService.save(newFood);

        return "Food added successfully!";
    }

    @PostMapping("/deleteFood")
    @ResponseBody
    public String deleteFood(@RequestParam("food_id") int theId){
        foodService.deleteById(theId);

        return "Delete successfully!";
    }

    @GetMapping("/getRandom")
    @ResponseBody
    public String getRandom(){
        List<Food> theFood = foodService.findAll();
        int allWeight = 0;
        int finalId = 0;

        for (int i=0; i<theFood.size() ;i++){
            allWeight += theFood.get(i).getWeight();
        }

        Random random = new Random();
        int endNumber = random.nextInt(allWeight + 1);


        for (int i=0; i<theFood.size() ;i++){
            if (theFood.get(i).getWeight() >= endNumber ){
                finalId = i;
                break;
            }else {
                endNumber = endNumber - theFood.get(i).getWeight();
            }
        }

        return theFood.get(finalId).getFood_name();
    }

}
