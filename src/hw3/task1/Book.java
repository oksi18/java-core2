package hw3.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book implements Printable{
    public int pages;
    public String title;

    @Override
    public boolean print() {
        System.out.println("Друкую книгу: " + "pages: " + pages + "  " + "title: " + title);
        return false;
    }
}
