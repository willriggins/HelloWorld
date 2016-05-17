/**
 * Created by will on 5/16/16.
 */
public class Chair {
    boolean hasWheels;
    int numberOfWheels;
    boolean onSwivel;
    boolean isLeather;
    double weight;
    String brand;

    public Chair(boolean hasWheels, int numberOfWheels, boolean onSwivel, boolean isLeather, double weight, String brand) {
        this.hasWheels = hasWheels;
        this.numberOfWheels = numberOfWheels;
        this.onSwivel = onSwivel;
        this.isLeather = isLeather;
        this.weight = weight;
        this.brand = brand;
    }

    public boolean getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean newHasWheels) {
        hasWheels = newHasWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int newNumberOfWheels) {
        numberOfWheels = newNumberOfWheels;
    }

    public boolean getOnSwivel() {
        return onSwivel;
    }

    public void setOnSwivel(boolean newOnSwivel) {
        onSwivel = newOnSwivel;
    }

    public boolean getIsLeather() {
        return isLeather;
    }

    public void setIsLeather(boolean newIsLeather) {
        isLeather = newIsLeather;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        if (isOfficeDepot(newBrand)) {
            brand = newBrand;
        }
    }

    public static boolean isOfficeDepot(String newBrand) {
        return newBrand.contains("Office Depot");
    }
}
