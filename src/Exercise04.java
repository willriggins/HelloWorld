import java.util.HashMap;

/**
 * Created by will on 6/8/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};

        HashMap<String, String> namesMap = new HashMap<>();

        for (int i = 0; i < names.length; i+=2) {
            String firstName = names[i];
            String lastName = names[i+1];
            namesMap.put(lastName, firstName);
        }

        System.out.println(namesMap);


    }

}
