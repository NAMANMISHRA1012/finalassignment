package assignments.com;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()="
				+ getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies() + "]";
	}
	
	
	public  void checkIn(){
		numberOfCopies= numberOfCopies + 1;
		}
		public void checkOut(){
			numberOfCopies=numberOfCopies - 1;
		}
		
	

}
