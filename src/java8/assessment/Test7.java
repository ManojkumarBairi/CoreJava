package java8.assessment;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Test7 {

	public static void main(String[] args) {
		
		Stream<Integer> inputs = Stream.of(8,7,10,15,20,22,30);
		System.out.println(inputs.filter((n)-> n%5 == 0).count());
		
		LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 11);//line 1
		LocalDate date2 = LocalDate.of(2016, 11, 12);
		System.out.println(date1.compareTo(date2));
		
		/*LocalDate date = LocalDate.of(12, 11, 2016);
		System.out.println(date);*/
		
		
	/*	LocalDate d = LocalDate.of(2016, 04, 01);
		LocalDate d2 = LocalDate.of(2016, 04, 31);
		long duration = ChronoUnit.DAYS.between(d, d2);
		System.out.println(duration);*/
		
		LocalDate date = LocalDate.of(2016, 11, 13);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy",Locale.UK);
		System.out.println(date.format(formatter));
		
	}

}
