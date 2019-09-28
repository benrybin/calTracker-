package calTracker.demo.calTracker.Services;

import calTracker.demo.calTracker.Models.Meal;
import calTracker.demo.calTracker.Repos.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    MealRepo mealRepo;

    public Boolean save(Meal meal){
           List<Meal> temp= mealRepo.findByDate(meal.getDate());

        for (Meal mealCheck:temp) {
            if(meal.getMealType().equals(mealCheck.getMealType())){
                return false;
            }

        }
           mealRepo.save(meal);

            return true;
        }
        public Iterable<Meal> findAll(){

        return mealRepo.findAll();

    }
    public List<Meal> getMealByDate(String date){
        return mealRepo.findByDate(date);
    }

}
