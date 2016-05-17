/**
 * Created by will on 5/16/16.
 */
public class House {
    boolean isNew;
    boolean isLivedIn;
    String type;
    int price;
    int year;
    int numberOfWindows;
    int numberOfOccupents;
    double numberOfBaths;

    public House(boolean isNew, boolean isLivedIn, String type, int price, int year, int numberOfWindows, int numberOfOccupents, double numberOfBaths) {
        this.isNew = isNew;
        this.isLivedIn = isLivedIn;
        this.type = type;
        this.price = price;
        this.year = year;
        this.numberOfWindows = numberOfWindows;
        this.numberOfOccupents = numberOfOccupents;
        this.numberOfBaths = numberOfBaths;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newIsNew) {
        isNew = newIsNew;
    }

    public boolean getIsLivedIn() {
        return isLivedIn;
    }

    public void setIsLivedIn(boolean newIsLivedIn) {
        isLivedIn = newIsLivedIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        if (isValidYear(newYear)) {
            year = newYear;
        }
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int newNumberOfWindows) {
        numberOfWindows = newNumberOfWindows;
    }

    public int getNumberOfOccupents() {
        return numberOfOccupents;
    }

    public void setNumberOfOccupents(int newNumberOfOccupents) {
        numberOfOccupents = newNumberOfOccupents;
    }

    public double getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(double newNumberOfBaths) {
        numberOfBaths = newNumberOfBaths;
    }

    public static boolean isValidYear(int newYear) {
        return newYear >= 2016;
    }
}
