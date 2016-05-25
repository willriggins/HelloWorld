import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by will on 5/25/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt"); // our file object
        //now create an object that will write things to the above file

        FileWriter fw = new FileWriter(f);
        fw.write("Alice \n"); // overwrites the file if it exists, and puts this string in it.
        fw.append("Bob \n"); // append does not overwrite, just adds to.
        fw.append("Charlie \n");
        fw.close(); // must close after opening and writing the file

        //read line-by-line
        Scanner scanner = new Scanner(f); // can give it the file object, f, as an argument
        while (scanner.hasNext()) {
            //while there is something left in that file, hasNext will return true.
            System.out.println(scanner.nextLine());
        }

        //read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z"); // \\Z is a special character that looks to the end of the file
        System.out.println(scanner.next());
    }
}
