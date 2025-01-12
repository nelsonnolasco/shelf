public class BookGenre {

	private Book book;

	private Genre genre;
	

	// No-argument constructor
	public BookGenre() {
	}

	// Parameterized constructor
	public BookGenre(Book book, Genre genre) {
		this.book = book;
		this.genre = genre;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
