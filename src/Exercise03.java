import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by will on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward"};

        // my solution

        ArrayList<String> arr = new ArrayList<>();
        for (String name : names) {
            String upperCase = name.toUpperCase();
            if (upperCase.startsWith("A")) {
                arr.add(upperCase);
            }
        }
        System.out.println(arr);

        // new solution 1: modify index after removing
        ArrayList<String> newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        for (int i = 0; i < newNames.size(); i++) {
            String name = newNames.get(i);
            if (!name.startsWith("A")) {
                newNames.remove(i);
                i--;
            }
        }
        System.out.println(newNames);

        //new solution 2: use temp collections
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
        }
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : newNames) {
            if (name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        System.out.println(tempNames);

        //good solution 3: iterator
        Iterator<String> iter = newNames.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(newNames);

        /** class notes: map: run function on every item in call
        * filter: return only items that function is true for
        *
        *
        */

        //       great solution 4: use a stream

        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name);
        }
        newNames = newNames.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(newNames);
    }

}
