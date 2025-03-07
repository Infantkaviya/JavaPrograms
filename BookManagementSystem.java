import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class Library {
    private Book[] books;
    private int count;

    // Constructor
    public Library() {
        this.books = new Book[5];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book '" + books[i].getTitle() + "' removed from library.");
                books[i] = books[count - 1]; // Replace with last book
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books available in the library:");
            for (int i = 0; i < count; i++) {
                books[i].displayBookInfo();
            }
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(bookID, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book Found:");
                        foundBook.displayBookInfo();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
