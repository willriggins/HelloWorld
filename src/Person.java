/**
 * Created by will on 5/16/16.
 */
// this.name says it's a field inside of a class that we're in right now.
//void indicates that it doesnt return anything
public class Person { // public is an access modifier, ie anything in java can access this class
    static int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }

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


}
