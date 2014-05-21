package homework;

import java.util.HashSet;
import java.util.Scanner;

public class _02generateThreeLetterWords {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a set of different letters as a string");
		String letters = reader.nextLine();
		
		while (!isValidInput(letters)) {
			System.out.println("Letters should not repeat");
			letters = reader.nextLine();
		}
		
		for (int i = 0; i < letters.length(); i++) {
			
			for (int j = 0; j < letters.length(); j++) {
				
				for (int k = 0; k < letters.length(); k++) {
					
					System.out.printf("%c%c%c%n", letters.charAt(i),
										  			letters.charAt(j), 
									  				letters.charAt(k));
				}
				
			}
			
		}
	}
	
	public static boolean isValidInput(String input) {
		
		HashSet<Character> letters = new HashSet<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			
			if (letters.contains(input.charAt(i))) {
				return false;
			}
			
			letters.add(input.charAt(i));
		}
		
		return true;
	}

}
