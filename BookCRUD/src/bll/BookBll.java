package bll;
import dto.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookBll {
		public List<Book> listAllBooks();
		public Book getBook(int id);
		public void deleteBook(int id);
		public void updateBook(Book book);
		public void addBook(Book book) throws SQLException;
}
