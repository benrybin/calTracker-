package calTracker.demo.calTracker.Controllers;

import calTracker.demo.calTracker.Models.Meal;
import calTracker.demo.calTracker.Services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MealController {
    @Autowired
    private MealService mealService;

    @PostMapping(path="/addmeal")
    @ResponseBody
    public Boolean addMeal(@RequestBody Meal meal){


       return mealService.save(meal);
    }
    @GetMapping(path="/dailymeals")

    public List<Meal> getCurrentDaysMeals(@RequestParam String date){

        return mealService.getMealByDate(date);


    }
    @GetMapping(path = "/allmeals")
    public Iterable<Meal> allMeals(){
        return mealService.findAll();
    }
    @GetMapping(path = "/mealTypes")
    public List<String> mealTypesEntered(@RequestParam String date){
        return mealService.mealTypesAlreadyEntered(date);
    }

}
