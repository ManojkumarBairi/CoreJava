package java8prog2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {

	/*public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.of(2018, 04,20,15,35,32);
		DateTimeFormatter formatterPattern=DateTimeFormatter.ofPattern("dd-m-yyyy");
		String str=dateTime.format(formatterPattern);
		System.out.println(str);

	}*/
	
		public static void main(String[] args) {
			LocalDate date=LocalDate.of(2018,4,18);
			date=date.minusDays(18);
			date.minusMonths(1);
			System.out.println(date);	
		
	}
}
