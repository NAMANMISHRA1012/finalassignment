package java8.com;


interface MyInterface{
	
	 default void show();
	

}


class MyClass implements MyInterface{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	
	
	
}

public class DefaultAndStatic {
	public static void main(String[] args) {
		
	
	MyInterface mi = new MyClass(); 
		mi.show();
		
	
	
	
	

}}
