package homework;

import java.util.Scanner;

public class _06FormattingNumbers {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter integer between 0-500:");
		int firstNum = reader.nextInt();
		
		System.out.println("Enter a floating point number:");
		double secondNum = reader.nextDouble();
		
		System.out.println("Enter another floating point number:");
		double thirdNum = reader.nextDouble();
		
		// width is set to 10 spaces and the flag '-' creates padding on the right
		System.out.printf("|%-10s|", Integer.toHexString(firstNum).toUpperCase());
		
		// pad with 10 spaces to the left then replace the space with zeroes
		System.out.printf(String.format("%10s|", Integer.toBinaryString(firstNum)).replace(' ', '0'));
		
		// pad with 10 spaces to the left, precision 2 digits
		System.out.printf("%10.2f|", secondNum);
		
		// pad with 10 spaces to the right, precision 3 digits
		System.out.printf("%-10.3f|", thirdNum);
	}

}
