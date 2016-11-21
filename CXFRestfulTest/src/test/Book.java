package test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
public class Book {
	private String author;
	private String bookId;
	private String bookISBNnumber;
	private String bookName;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookISBNnumber() {
		return bookISBNnumber;
	}

	public void setBookISBNnumber(String bookISBNnumber) {
		this.bookISBNnumber = bookISBNnumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}