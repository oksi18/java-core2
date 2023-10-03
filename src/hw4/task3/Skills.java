package hw4.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Skills {
    private String title;
    private int exp;

    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}