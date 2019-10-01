package calTracker.demo.calTracker.Models;

import java.util.HashSet;
import java.util.Set;

public class DeleteMe {

    String test = "abcaaaccb";

    public String smallestSubstring(String test){
        String[] holder = test.split("");
        Set <String> holder2 = new HashSet();

        for (int i = 0; i <holder.length; i++) {
            holder2.add(holder[i]);

        }

        return "";
    }
}
