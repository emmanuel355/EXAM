
package exam1.librarymanagementsystem;

/**
 *
 * @author BASHREIK
 */
public class Book {
    private final String title;
    private final String author;
    private final String publisher;
    private final String city;
    private final String dateOfPublication;
    private final double price;
    private ISBN isbn;

    public Book(String title, String author, String publisher, String city,
                String dateOfPublication, double price, ISBN isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.isbn = isbn;
    }

    public void setBookIsbn(ISBN isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookIsbn() {
        return isbn.getIsbn();
    }

    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("City of Publication: " + city);
        System.out.println("Date of Publication: " + dateOfPublication);
        System.out.printf("Price: $%.2f\n", price);  // Formatted price output
        System.out.println("ISBN: " + getBookIsbn());
    }
}
