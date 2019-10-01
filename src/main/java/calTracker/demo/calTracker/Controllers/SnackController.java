package calTracker.demo.calTracker.Controllers;

import calTracker.demo.calTracker.Models.Snack;
import calTracker.demo.calTracker.Services.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SnackController {
    @Autowired
    SnackService snackService;
    @PostMapping(path="/addsnack")
    @ResponseBody
    public Boolean addSnack(@RequestBody Snack snack){


        return snackService.save(snack);
    }
    @GetMapping(path="/dailysnacks")

    public List<Snack> returnDailySnacks(@RequestParam String date){

        return snackService.dailySnacks(date);

    }
}
