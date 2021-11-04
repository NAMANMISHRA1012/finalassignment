package assignments.com;

import java.sql.Date;
import java.time.LocalDate;

public class JournalPaper extends WrittenItem{
	private LocalDate yearPublished;
	

	public JournalPaper(String author, LocalDate yearPublished) {
		super(author);
		this.yearPublished = yearPublished;
	}

	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(String author) {
		super(author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor() + ", toString()="
				+ super.toString() + ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()="
				+ getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies() + "]";
	}
	
	
	

}
