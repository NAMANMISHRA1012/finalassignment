package assignments.com;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(String author) {
		super();
		this.author = author;
	}

	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getAuthor()=" + getAuthor() + ", getIdentificationNumber()="
				+ getIdentificationNumber() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()="
				+ getNumberOfCopies() + "]";
	}
	

	
	
	

}
