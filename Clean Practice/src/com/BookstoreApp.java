package com;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private User user;
    private List<Book> books;
    private Payment payment;

    public Order(int orderId, User user, List<Book> books, Payment payment) {
        this.orderId = orderId;
        this.user = user;
        this.books = books;
        this.payment = payment;
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
}

class Payment {
    private double amount;
    private String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
}

class Cart {
    private List<Book> books;

    public Cart() {
        this.books = new ArrayList<>();
    }

    public void addToCart(Book book) {
        books.add(book);
    }

    public void removeFromCart(Book book) {
        books.remove(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}

public class BookstoreApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", "john.doe@example.com", "123 Main St"));
        users.add(new User("Jane Smith", "jane.smith@example.com", "456 Elm St"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 39.99));
        books.add(new Book("The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt, David Thomas", 29.99));
    }
}