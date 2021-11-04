package assignments.com;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		
		JournalPaper k= new JournalPaper(10,"abc",4);
		JournalPaper j = new JournalPaper("mishra",d);
		j.toString();

		
		System.out.println(k);
	}

}
