import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by will on 5/18/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // Angle brackets here fix line 14 error.
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //String name = (String) names.get(0); // "CASTING" fix here. Would not run without (String) in front of method
        String name = names.get(0);

        HashMap<String, Integer> scores = new HashMap(); //adding type of collection this way is called "GENERICS"
        scores.put("Alice", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 3);

        int score = scores.get("Bob");
    }
}
