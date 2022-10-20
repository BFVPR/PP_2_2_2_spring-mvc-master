package web.Entity;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int index;
    private String model;
    private int yearOfProduction;
    private String color;

    public Car() {
    }

    public Car(int index, String model, int yearOfProduction, String color) {
        this.index = index;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
