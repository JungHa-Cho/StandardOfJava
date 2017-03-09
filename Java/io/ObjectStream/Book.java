import java.io.Serializable;

public class Book implements Serializable
{
    private String isbn;
    private String title;
    private String author;
    private int price;

    public Book(String isbn, String title, String author, int price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getIsbn() { return isbn; }
    public String setIsbn(String isbn) { this.isbn = isbn; }
    public String getTitle() { return title; }
    public String setTitle(String title;) { this.title = title; }
    public String getAuthor() { return author; }
    public String setAuthor(String autho) { this.author = author; }
    public String getPrice() { return price; }
    public String setPrice(int price) { this.price = price; }

    public String toString()
    {
        return getIsbn() + ", " + getTitle() + ", " + getAuthor() + ", " + getPrice();
    }
}