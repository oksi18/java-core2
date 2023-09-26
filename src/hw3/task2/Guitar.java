package hw3.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar implements Instrument{
    public int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Грає гітара з " + numberOfStrings + " струнами");
    }
}
