package hw4.task1;

//Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Users> users = new ArrayList<>();
        users.add(new Users("Alex", 23));
        users.add(new Users("Anna", 34));
        users.add(new Users("Olha", 21));
        users.add(new Users("Danil", 23));
        users.add(new Users("Oksana", 19));

        users.sort(Comparator.comparing(Users::getAge));
        System.out.println("By growth: ");
        users.forEach(user -> System.out.println(user.getName() + "  " + user.getAge() + " years"));

        users.sort(Comparator.comparing(Users::getAge)
                .reversed());
        System.out.println("By decline: ");
        users.forEach(user -> System.out.println(user.getName() + "  " + user.getAge() + " years"));

        users.sort(Comparator.comparing(user -> user.getName().length()));
        System.out.println("By growth(name): ");
        users.forEach(user -> System.out.println(user.getName() + "  " + user.getAge() + " years"));

        users.sort(Comparator.comparing(user -> user.getName().length(),  Comparator.reverseOrder()));
        System.out.println("By decline (name): ");
        users.forEach(user -> System.out.println(user.getName() + "  " + user.getAge() + " years"));

    }
}
