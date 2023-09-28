package hw4.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Users {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
