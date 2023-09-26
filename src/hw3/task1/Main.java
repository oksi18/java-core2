package hw3.task1;

//а) Оприділити інтерфейс Printable, який містить метод void print().
//        б) Оприділити клас Book, що реалізує інтерфейс Printable.
//        в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//        г) Створити масив типу Printable, який буде містити книги та журнали.
//
//        Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//        Інтерфейс Instrument  містить метод play().
//        Клас "Гітара" містить змінну класу "кількістьСтрун",
//        клас "Барабан" - розмір, а клас "Труба" - діаметр.
//        Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//        У циклі викликати метод play() для кожного інструменту,
//        який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".

public class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[3];
        printable[0] = new Book(200, "War");
        printable[1] = new Magazine("Журнал 1");
        printable[2] = new Book(300,"Книга 2");

        for (Printable item : printable) {
            item.print();
        }
    }
}