package brcomncn.shelf;

import java.util.Date;

public class Loan {

	private int id;

	private Book book;

	private String userName;

	private Date loanDate;

	private Date returnDate;

	public Loan(int id, Book book, String userName, Date loanDate, Date returnDate) {
		super();
		this.id = id;
		this.book = book;
		this.userName = userName;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
}
