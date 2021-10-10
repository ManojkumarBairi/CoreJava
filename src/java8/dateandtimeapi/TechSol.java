package java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.Month;

class AdvanceSalary {
    private LocalDate from;
    private LocalDate to;

    public AdvanceSalary(LocalDate from,LocalDate to) {
        this.from = from;
        this.to = to;
    }
    
    public void checkDates() {
        int compare = from.compareTo(to);
        System.out.println(compare);
        // Logic that makes sure from is not greater than to
    }
}
public class TechSol {

	public static void main(String[] args) {
		LocalDate from = LocalDate.of(2016, Month.JUNE, 01);
        LocalDate to = LocalDate.of(2016, Month.JUNE, 03);
        AdvanceSalary advance = new AdvanceSalary(from, to);
        advance.checkDates();

	}

}
