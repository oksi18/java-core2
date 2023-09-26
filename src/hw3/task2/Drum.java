package hw3.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drum implements Instrument{
    public int size;
    @Override
    public void play() {
        System.out.println("Грає барабан розміром: " + size);
    }
}
