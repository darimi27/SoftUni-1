package homework;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first = reader.nextInt();
		
		System.out.println("Enter second number:");
		int second = reader.nextInt();
		
		int result = first + second;
		
		System.out.printf("%d + %d = %d", first, second, result);
	}

}
