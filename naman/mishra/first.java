package naman.mishra;

public class first {
	public int age;
	public String name;
	public first(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public first() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "first [age=" + age + ", name=" + name + "]";
	}
	
	

}
