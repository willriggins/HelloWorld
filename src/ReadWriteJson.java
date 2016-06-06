import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by will on 5/25/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        HashMap person = new HashMap();
        person.put("name", "Alice");
        person.put("age", 30);

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 40;

        /** When passing a class into serialize (or maybe json methods all together, you need a getter/setter
         * or it won't collect those fields. This only applies if you're passing in an object.
         *
         * HashMaps may be easier, class might be safer?
         */

        File f = new File("person.json");

        //write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(person2);
        FileWriter fw = new FileWriter(f);
        fw.write(json); //pass in our string called json
        fw.close();

        //read json

        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        JsonParser parser = new JsonParser();
        //HashMap person3 = parser.parse(contents);
        Person person3 = parser.parse(contents, Person.class);
        System.out.println(person3);
    }

    
}
