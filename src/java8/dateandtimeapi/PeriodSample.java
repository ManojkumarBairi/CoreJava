package java8.dateandtimeapi;

import java.time.Period;

public class PeriodSample {

	public static void main(String[] args) {
		Period p=Period.of(1, 5, 2001);
System.out.println(p.getDays()+"\""+p.getMonths());
	}

}
