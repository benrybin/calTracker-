package calTracker.demo.calTracker.Repos;

import calTracker.demo.calTracker.Models.Snack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnackRepo extends JpaRepository<Snack,Integer> {

    List<Snack> findByDate(String date);
}
