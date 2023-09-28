package hw4.task2;

//створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("january");
        elements.add("february");
        elements.add("march");
        elements.add("april");
        elements.add("may");
        elements.add("june");
        elements.add("july");
        elements.add("august");
        elements.add("august");
        elements.add("september");
        elements.add("october");
        elements.add("november");
        elements.add("december");
        elements.add("winter");
        elements.add("spring");
        elements.add("summer");
        elements.add("autumn");


        Collections.sort(elements);

        for (String element : elements) {
            System.out.println(element);
        }

    }
}
