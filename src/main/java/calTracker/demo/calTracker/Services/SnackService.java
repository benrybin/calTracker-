package calTracker.demo.calTracker.Services;

import calTracker.demo.calTracker.Models.Snack;
import calTracker.demo.calTracker.Repos.SnackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnackService {
    @Autowired
    SnackRepo snackRepo;

    public boolean save(Snack snack){
        snackRepo.save(snack);

        return true;
    }
    public List<Snack> dailySnacks(String date){
        return snackRepo.findByDate(date);
    }
}
