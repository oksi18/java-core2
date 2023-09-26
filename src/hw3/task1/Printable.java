package hw3.task1;

public interface Printable {
    boolean print();

    default void printSmth() {
        System.out.println(print());
    }
}
