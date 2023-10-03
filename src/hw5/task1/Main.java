package hw5.task1;

//створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .
//        *-- відфільтрувати слова довжиною менше 4 символів

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("honeydew");
        words.add("kiwi");
        words.add("lemon");
        words.add("mango");
        words.add("orange");
        words.add("papaya");
        words.add("quince");
        words.add("raspberry");
        words.add("strawberry");
        words.add("tangerine");
        words.add("watermelon");
        words.add("blueberry");
        words.add("cranberry");

        List<String> filtered = words.stream().filter(word -> word.length() > 4).collect(Collectors.toList());;
        System.out.println(filtered);

//        words.sort(String::compareTo);
//        System.out.println(words);
    }
}