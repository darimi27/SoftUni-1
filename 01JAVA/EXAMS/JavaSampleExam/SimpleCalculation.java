package softuni.exam;

import java.util.Scanner;

public class SimpleCalculation {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else if (x > 0 && y < 0) {
			System.out.println(4);
		} else if (x == 0 && y == 0) {
			System.out.println(0);
		} else if (x == 0) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

	}

}
