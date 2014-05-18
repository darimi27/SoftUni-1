package homework;

import java.util.Scanner;

public class _08countBitPairs {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a integer number");
		int userInput = reader.nextInt();
		
		int bitPairCount = countBitPairs(userInput);
		System.out.println("There are " + bitPairCount +
							" bit pairs in the number " + userInput);
	}
	
	public static int countBitPairs(int number) {
		int bitPairs = 0;
		
		// initialize them to -1 because its not a valid
		// bit value and we don't want to enter in the if
		// statement the first time we enter the while loop
		int currentBit = -1;
		int previousBit = -1;
		
		while (number > 0) {
			previousBit = currentBit;
			currentBit = number & 1;
			
			if (previousBit == currentBit) {
				bitPairs++;
			}			
			
			number = number >> 1;
		}
		
		return bitPairs;
	}

}
