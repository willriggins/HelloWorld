import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by will on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1st step: parse people.csv into ArrayList<String> that contain first and last names separated by a space
        // prompt the user for search term
        // loop over the array list (?)
        // print out the names that contain the term


        File f = new File("people.csv");
        ArrayList<String> names = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Scanner scanner = new Scanner(f);

        scanner.nextLine();
        int i = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            names.add(i + ". " + columns[1] + " " + columns[2]);
            i++;
        }
        System.out.println("What would you like to search?");
        String search = s.nextLine();

        // solve via for loop
        for (String name : names) {
            if (name.contains(search)) {
                System.out.println(name);
            }
        }
        System.out.println();
        // solve via stream
        names = names.stream()
                .filter(name -> name.contains(search))
//                .forEach(System.out::println);
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(names);
    }


}
