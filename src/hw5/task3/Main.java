package hw5.task3;

//Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//        Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//        Створити не менше 7 та не більше 20 машинок.
//        Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//        Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//        Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//        Все через stream API

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Audi", 230, new Owner("oleh", 23, 5), 35000, 2018),
                new Car("BMW", 300, new Owner("vlad", 30, 7), 50000, 2019),
                new Car("Mercedes", 250, new Owner("olha", 25, 3), 900000, 2021),
                new Car("GMC", 270, new Owner("mark", 28, 10), 57000, 2019),
                new Car("Porsche", 320, new Owner("kate", 34, 12), 100000, 2020),
                new Car("Volkswagen", 150, new Owner("andrey", 45, 20), 17000, 2010),
                new Car("Bentley", 450, new Owner("danilo", 23, 5), 300000, 2022),
                new Car("Toyota", 280, new Owner("stepan", 21, 2), 15000, 2016),
                new Car("Honda", 190, new Owner("lesya", 22, 1), 10000, 1015)
                );

        cars.stream().filter(car -> cars.indexOf(car)<cars.size()/2).forEach(car -> car.setPower((int) (car.getPower()+car.getPower()*0.1)));

        System.out.println(cars);

        cars.stream().filter(car -> car.getOwner().getAge()>25&&car.getOwner().getExp()<5).forEach(car -> car.getOwner().setExp(car.getOwner().getExp()+1));

        System.out.println(cars);

    }
}
