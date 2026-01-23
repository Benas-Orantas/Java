import java.util.ArrayList;

public class Book implements Packable{

    private String author;
    private String book;
    private double weight;

    public Book(String author, String book, double weight) {
        this.author = author;
        this.book = book;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return author + ": " + book;
    }
}
