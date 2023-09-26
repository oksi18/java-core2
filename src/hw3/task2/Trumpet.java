package hw3.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trumpet implements Instrument{
    public int diameter;


    @Override
    public void play() {
        System.out.println("Грає труба з діаметром: " + diameter);
    }
}
