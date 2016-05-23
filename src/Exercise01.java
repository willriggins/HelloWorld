import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by will on 5/23/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Andrea", "Albert", "Beth"};

        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();

        //for each name in names: (how to read the line below)
        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            nameMap.put(firstLetterStr, new ArrayList<>());
        }

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            arr.add(name);
        }
        System.out.println(nameMap);

        // alternative solution
        nameMap = new HashMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            if (arr == null) {
                arr = new ArrayList<>();
                arr.add(name);
                nameMap.put(firstLetterStr, arr);
            }
            else {
             arr.add(name);
            }
        }
        System.out.println(nameMap);

    }
}
