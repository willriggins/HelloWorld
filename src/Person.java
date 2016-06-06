import java.util.Arrays;

/**
 * Created by will on 5/16/16.
 */
// this.name says it's a field inside of a class that we're in right now.
//void indicates that it doesnt return anything
public class Person implements Comparable {
    static final int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];
    Email email;

    public Person() {

    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
       // if (isValidName(newName)) {
            name = newName;
       // }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean newIsAlive) {
        isAlive = newIsAlive;
    }

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                ", email=" + email +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o; //check the course github for the generics version of this
        return this.name.compareTo(otherPerson.name);
        /** this teaches java that if it ever wants to compare person objecs,
        * it should just be comparing their names
         */

    }
}
