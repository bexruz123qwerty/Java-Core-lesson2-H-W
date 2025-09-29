package com.example.lesson3.part1;

public class Book {

    private final String isbn;
    private final String name;
    private final String author;
    private final int year;
    private BookedStatus status;

    private static Book[] books = new Book[100];
    private static int count = 0;

    public Book() {
        this.isbn = "123-456";
        this.name = "Default Book";
        this.author = "Unknown Author";
        this.year = 2000;
        this.status = BookedStatus.AVAILABLE;
    }

    public Book(String isbn, String name, String author, int year, BookedStatus status) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public enum BookedStatus {
        AVAILABLE, BOOKED
    }

    public String getBookInfo() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", status=" + status +
                '}';
    }

    public static Book[] getBooks() {
        Book[] currentBooks = new Book[count];
        for (int i = 0; i < count; i++) {
            currentBooks[i] = books[i];
        }
        return currentBooks;
    }

    public static void addNewBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void reserveBook() {
        if (status == BookedStatus.AVAILABLE) {
            status = BookedStatus.BOOKED;
            System.out.println("Book " + name + " has been successfully reserved.");
        } else {
            System.out.println("Book " + name + " is already reserved.");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("111", "Java Basics", "John Doe", 2020, BookedStatus.AVAILABLE);
        Book b2 = new Book("222", "OOP Concepts", "Jane Smith", 2021, BookedStatus.AVAILABLE);

        addNewBook(b1);
        addNewBook(b2);

        for (Book b : getBooks()) {
            System.out.println(b.getBookInfo());
        }

        b1.reserveBook();
        System.out.println(b1.getBookInfo());
    }
}