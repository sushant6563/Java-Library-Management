package models;

public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;

    // Constructors
    public Book() {
        // Default constructor
    }

    public Book(int id, String title, String author, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // toString method for displaying book details
    @Override
    public String toString() {
        return STR."Book{id=\{id}, title='\{title}', author='\{author}', publisher='\{publisher}', year=\{year}}";
    }
}
}
