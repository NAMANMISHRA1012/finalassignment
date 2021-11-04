package naman.mishra;

public class Second extends first{
	public String address;
	public int id;
	public Second(int age, String name, String address, int id) {
		super(age, name);
		this.address = address;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Second [address=" + address + ", id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	

}
