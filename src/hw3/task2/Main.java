package hw3.task2;

//        Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//        Інтерфейс Instrument  містить метод play().
//        Клас "Гітара" містить змінну класу "кількістьСтрун",
//        клас "Барабан" - розмір, а клас "Труба" - діаметр.
//        Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//        У циклі викликати метод play() для кожного інструменту,
//        який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(23);
        instruments[2] = new Trumpet(10);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
