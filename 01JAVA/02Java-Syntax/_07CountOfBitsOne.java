package homework;

import java.util.Scanner;

public class _07CountOfBitsOne {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer number");
		int userInput = reader.nextInt();
		
		int setBits = countSetBits(userInput);
		
		System.out.println("The number of set bits is: " + setBits);
		System.out.println("Sparse bit counting: " + sparseBitCount(userInput));
		System.out.println("Built-in method: " + Integer.bitCount(userInput));
	}

	public static int countSetBits(int number) {
		int count = 0;
		
		while (number != 0) {
			count += number & 1;
			number >>>= 1;
		}
		
		return count;
	}
	
	public static int sparseBitCount(int number) {
		int count = 0;
		
		while (number != 0) {
			count++;
			number &= (number - 1);
		}
		
		return count;
	}

}
