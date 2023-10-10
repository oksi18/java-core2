package hw5.task3;


import lombok.AllArgsConstructor;

import java.util.Objects;

// Імя, вік, стаж водіння.
@AllArgsConstructor
public class Owner {
    private String name;
    private int age;
    private int exp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return getAge() == owner.getAge() && getExp() == owner.getExp() && Objects.equals(getName(), owner.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getExp());
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }
}
