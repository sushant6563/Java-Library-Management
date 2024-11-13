package com.Services.main;

import com.Services.dao.BookDAO;
import com.Services.dao.MemberDAO;
import com.Services.dao.LoanDAO;
import com.Services.model.Book;
import com.Services.model.Member;
import com.Services.model.Loan;
import com.Services.service.BookService;
import com.Services.service.MemberService;
import com.Services.service.LoanService;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;ver

public class Main {
    public static void main(String[] args) {
        // Initialize database connection
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String jdbcUsername = "your_username";
        String jdbcPassword = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
            System.out.println("Database connected successfully.");

            // Initialize DAOs
            BookDAO bookDAO = new BookDAO(connection);
            MemberDAO memberDAO = new MemberDAO(connection);
            LoanDAO loanDAO = new LoanDAO(connection);

            // Initialize Services
            BookService bookService = new BookService(bookDAO);
            MemberService memberService = new MemberService(memberDAO);
            LoanService loanService = new LoanService(loanDAO);

            // Book Operations
            Book newBook = new Book("Effective Java", "Joshua Bloch", "Addison-Wesley", 2018);
            bookService.addBook(newBook);
            System.out.println("Added book: " + newBook);

            Book retrievedBook = bookService.getBookById(newBook.getId());
            System.out.println("Retrieved book: " + retrievedBook);

            // Update book
            retrievedBook.setYear(2020);
            bookService.updateBook(retrievedBook);
            System.out.println("Updated book: " + retrievedBook);

            // Delete book
            bookService.deleteBook(retrievedBook.getId());
            System.out.println("Deleted book with ID: " + retrievedBook.getId());

            // Member Operations
            Member newMember = new Member("John Doe", "john@example.com", "123-456-7890");
            memberService.addMember(newMember);
            System.out.println("Added member: " + newMember);

            Member retrievedMember = memberService.getMemberById(newMember.getId());
            System.out.println("Retrieved member: " + retrievedMember);

            // Loan Operations
            Loan newLoan = new Loan(newBook.getId(), newMember.getId(), Date.valueOf("2024-01-01"), Date.valueOf("2024-02-01"));
            loanService.addLoan(newLoan);
            System.out.println("Added loan: " + newLoan);

            Loan retrievedLoan = loanService.getLoanById(newLoan.getId());
            System.out.println("Retrieved loan: " + retrievedLoan);

            // Display all loans
            List<Loan> allLoans = loanService.getAllLoans();
            System.out.println("All loans:");
            allLoans.forEach(System.out::println);

        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        }
    }
}
