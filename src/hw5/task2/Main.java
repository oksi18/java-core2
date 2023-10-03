package hw5.task2;

//- Створити масив з 20 числами.
//        - за допомогою способу sorted відсортувати масив.
//        -- за допомогою filter отримати числа кратні 3
//        -- за допомогою filter отримати числа кратні 10
//        -- перебрати (проітерувати) масив за допомогою foreach()
//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {17, 64, 29, 50, 91, 6, 38, 77, 12, 83, 42, 59, 3, 74, 45, 22, 96, 11, 55, 71};
        Arrays.sort(numbers);

        int[] multiplesOf3 = Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .toArray();

        int[] multiplesOf10 = Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .toArray();

        int[] multipliedBy3 = Arrays.stream(numbers)
                .map(num -> num * 3)
                .toArray();

        System.out.println("відсортовані:");
        Arrays.stream(numbers)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();

        System.out.println("кратні 3:");
        Arrays.stream(multiplesOf3)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();

        System.out.println("кратні 10:");
        Arrays.stream(multiplesOf10)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();

        System.out.println("значення у 3 рази більші:");
        Arrays.stream(multipliedBy3)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
