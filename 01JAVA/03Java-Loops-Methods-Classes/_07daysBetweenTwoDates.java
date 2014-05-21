package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07daysBetweenTwoDates {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Enter first date (day-month-year):");
			LocalDate firstDate = LocalDate.parse(reader.nextLine(), DateTimeFormatter.ofPattern("d-M-yyyy"));
			
			System.out.println("Enter second date (day-month-year):");
			LocalDate secondDate = LocalDate.parse(reader.nextLine(), DateTimeFormatter.ofPattern("d-M-yyyy"));
			
			long daysBetweenDates = ChronoUnit.DAYS.between(firstDate, secondDate);
			
			System.out.println("Days between " + firstDate + " and " + secondDate + " : " +
								daysBetweenDates + " days");
			
		} catch (DateTimeParseException e) {
			System.out.println("You entered the date in the wrong format.");
		}		
	}

}
