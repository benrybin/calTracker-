package calTracker.demo.calTracker.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private List<Meal> dailyMeals;
    private List<Snack> dailySnacks;
    private boolean isDayComplete;
    private String date;
}
