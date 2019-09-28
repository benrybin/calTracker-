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
    @GetMapping(path="/dailymeals/{date}")

    public List<Meal> getCurrentDaysMeals(@PathVariable String date){

        return mealService.getMealByDate(date);


    }
    @GetMapping(path = "/allmeals")
    public Iterable<Meal> allMeals(){
        return mealService.findAll();
    }
}
