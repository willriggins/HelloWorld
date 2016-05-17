/**
 * Created by will on 5/16/16.
 */
public class Car {
    String color;
    String make;
    String model;
    boolean doesStart;
    int modelYear;
    double milesDriven;

    public Car(String color, String make, String model, boolean doesStart, int modelYear, double milesDriven) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.doesStart = doesStart;
        this.modelYear = modelYear;
        this.milesDriven = milesDriven;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        if (isFavoriteColor(newColor)) {
            color = newColor;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public boolean getDoesStart() {
        return doesStart;
    }

    public void setDoesStart(boolean newDoesStart) {
        doesStart = newDoesStart;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int newModelYear) {
        modelYear = newModelYear;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double newMilesDriven) {
        milesDriven = newMilesDriven;
    }

    public static boolean isFavoriteColor(String newColor) {
        return newColor.contains("blue");
    }
}

