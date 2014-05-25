package softuni.exam;

import java.util.Scanner;

public class MagicCarNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int magicWeight = scan.nextInt();
		
		// starting from 40 because all numbers begin with
		// CA -> A = 10, C = 30
		int startingCarNumberWeight = 40;
		
		// put all allowed letter in one array
		// put the weight at the same index in another array
		// the weight of allowedLetters[i] is lettersWeight[i]
		char[] allowedLetters = { 'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X' };
		int[] lettersWeight = { 10, 20, 30, 50, 80, 110, 130, 160, 200, 240 };
		
		int magicNumbersCount = 0;
		
		for (int firstNum = 0; firstNum <= 9; firstNum++) {
			
			for (int secondNum = 0; secondNum <= 9; secondNum++) {
				
				// should be different numbers so that
				// the patterns are correct
				if (firstNum == secondNum) {
					continue;
				}
				
				for (int firstLetter = 0; firstLetter < allowedLetters.length; firstLetter++) {
					
					for (int secondLetter = 0; secondLetter < allowedLetters.length; secondLetter++) {
						
						// check for pattern "abbb"
						int currentWeight = startingCarNumberWeight + firstNum + (3 * secondNum) +
										lettersWeight[firstLetter] + lettersWeight[secondLetter];
						
						if (currentWeight == magicWeight) {
							magicNumbersCount++;
						}
						
						// check for pattern "aaab"
						currentWeight = startingCarNumberWeight + (3 * firstNum) + secondNum +
								lettersWeight[firstLetter] + lettersWeight[secondLetter];
						
						if (currentWeight == magicWeight) {
							magicNumbersCount++;
						}
						
						// check for patterns "aabb", "abab", "abba"
						currentWeight = startingCarNumberWeight + (2 * firstNum) + (2 * secondNum) +
								lettersWeight[firstLetter] + lettersWeight[secondLetter];
						
						// we add 3 the the count because we are
						// matching 3 patterns
						if (currentWeight == magicWeight) {
							magicNumbersCount+=3;
						}
					}
				}
			}
		}
		
		// this check is outside of the others
		// because otherwise we get many repetitions of the same pattern
		for (int i = 0; i <= 9; i++) {
			
			for (int firstLetter = 0; firstLetter < lettersWeight.length; firstLetter++) {
				
				for (int secondLetter = 0; secondLetter < lettersWeight.length; secondLetter++) {
					
					// check for pattern "aaaa"
					int currentWeight = startingCarNumberWeight + (4 * i) +
										lettersWeight[firstLetter] + lettersWeight[secondLetter];
					
					if (currentWeight == magicWeight) {
						magicNumbersCount++;
					}
					
				}
			}
		}
		
		System.out.println(magicNumbersCount);
		
	}

}
