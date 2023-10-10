package hw5.task3;


import lombok.AllArgsConstructor;

import java.util.Objects;

// Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
@AllArgsConstructor
public class Car {
    private String model;
    private int power;
    private Owner owner;
    private int price;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(getPower(), car.getPower()) == 0 && getPrice() == car.getPrice() && getYear() == car.getYear() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getOwner(), car.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getPower(), getOwner(), getPrice(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
