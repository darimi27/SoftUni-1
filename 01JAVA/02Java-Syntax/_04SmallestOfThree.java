package homework;

import java.util.Scanner;

public class _04SmallestOfThree {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter three numbers to find the smallest of them:");
		
		double firstNum = reader.nextDouble();
		double secondNum = reader.nextDouble();
		double thirdNum = reader.nextDouble();
		
		double smallest = Math.min(firstNum, secondNum);
		smallest = Math.min(smallest, thirdNum);
		
		System.out.println("The smallest number is: " + smallest);
	}

}
