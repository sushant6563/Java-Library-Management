package Services;

import com.Services.dao.BookDAO;
import com.Services.model.Book;

import java.sql.SQLException;
import java.util.List;

public class BookService {
    private final BookDAO bookDAO;

    // Constructor
    public <BookDAO> BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    // Add a new book
    public void addBook(Book book) throws SQLException {
        bookDAO.addBook(book);
    }

    // Get a book by its ID
    public Book getBookById(int id) throws SQLException {
        return bookDAO.getBookById(id);
    }

    // Get all books
    public List<Book> getAllBooks() throws SQLException {
        return bookDAO.getAllBooks();
    }

    // Update a book
    public void updateBook(Book book) throws SQLException {
        bookDAO.updateBook(book);
    }

    // Delete a book by its ID
    public void deleteBook(int id) throws SQLException {
        bookDAO.deleteBook(id);
    }
}