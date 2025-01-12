package brcomncn.shelf;

import java.util.Date;

public class Book {

	private int id;
	private String isbn;
	private String title;
	private String subtitle;
	private Date publishedDate;
	private int pages;
	private String language;
	private String synopsis;
	private Shelf shelf;
	
public Book() {
}

public Book(int id, String isbn, String title, String subtitle, Date publishedDate, int pages,
			String language, String synopsis, Shelf shelf) {
    this.id = id;
    this.isbn = isbn;
    this.title = title;
    this.subtitle = subtitle;
    this.publishedDate = publishedDate;
    this.pages = pages;
    this.language = language;
    this.synopsis = synopsis;
    this.shelf = shelf;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}
}
