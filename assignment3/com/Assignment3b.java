package assignment3.com;

interface I2{
         boolean check(String u , String p);
}


public class Assignment3b {
	
	public static void main(String[] args) {
		I2 i = (username,password) -> {  if ((username.equals("abc"))&&(password.equals("123")))return true;return false;};
		System.out.println( i.check("Abc", "234"));
	}

}
