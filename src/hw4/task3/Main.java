package hw4.task3;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
 //       HashSet<User> users = new HashSet<>();
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1, "vasya",
                "pupkin", "asd@asd.com", 21, Gender.Male,
                Arrays.asList(new Skills("java", 10), new Skills("js", 10), new Skills("c++", 10)),
                new Car("toyota", 2021, 250)));
        users.add(new User(2,"olha", "kravchuk", "olha@ol.com", 23, Gender.Female,
                Arrays.asList(new Skills("node", 4), new Skills("react", 5)),
                new Car("tesla", 2020, 200)));
        System.out.println( users);

//        Iterator<User> userIterator = users.iterator();
//        while (userIterator.hasNext()) {
//            User user = userIterator.next();
//            if (user.gender == Gender.Male) {
//                userIterator.remove();
//            }
//            System.out.println(users);
//        }
//
//
    }
}
