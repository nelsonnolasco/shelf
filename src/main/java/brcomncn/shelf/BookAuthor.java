import brcomncn.shelf.Author;
import brcomncn.shelf.Book;

public class BookAuthor {

	private Book book;

	private Author author;
	

	public BookAuthor() {
	}

	public BookAuthor(Book book, Author author) {
		this.book = book;
		this.author = author;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
