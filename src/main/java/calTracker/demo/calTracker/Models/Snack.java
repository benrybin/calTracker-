package calTracker.demo.calTracker.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer calCount;
}
