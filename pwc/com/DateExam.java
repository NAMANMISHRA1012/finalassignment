package pwc.com;

import java.time.Duration;
import java.time.LocalDate;

public class DateExam {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalDate dob = LocalDate.of(1994, 02, 15);
		System.out.println(d.isAfter(dob));
	System.out.println(d);
	System.out.println(Duration.between(d,dob));
	
	}

}
