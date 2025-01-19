

package exam1.librarymanagementsystem;

/**
 *
 * @author BASHREIK
 */
public class LibraryManagementSystem {

    public static void main(String[] args) {
         ISBN isbn = new ISBN("0 941831 39 6");

        Book book = new Book("Object-oriented Programming with Java",
                             "David J. Barnes and Michael Kolling",
                             "Prentice Hall", 
                             "New York", 
                             "2003", 
                             59.99, 
                             isbn);

        book.printDetails();

        System.out.println("Author: " + book.getAuthor());
    }
    }

