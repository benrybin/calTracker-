package calTracker.demo.calTracker.Repos;

import calTracker.demo.calTracker.Models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepo  extends JpaRepository<Meal,Integer> {

    Meal findByMealType(String mealType);
    List<Meal> findByDate(String date);

}
