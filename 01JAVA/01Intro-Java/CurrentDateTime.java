package homework;

import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		System.out.printf("The time is: %1$tH:%1$tM:%1$tS:%1$tL%n", new Date());
		System.out.printf("The date is: %1$tA - %1$td/%1$tB/%1$tY", new Date());
	}

}
