package hw3.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Magazine implements Printable{
    public String name;
    @Override
    public void print() {
        System.out.println("Друкую журнал: " + name);
    }
}
