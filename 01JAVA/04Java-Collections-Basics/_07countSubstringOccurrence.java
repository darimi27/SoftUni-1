package homework;

import java.util.Scanner;

public class _07countSubstringOccurrence {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter text:");		
		String text = reader.nextLine().toLowerCase();
		
		System.out.println("Enter substring to search for:");
		String substringToSearch = reader.nextLine().toLowerCase();
		
		// starting at -1 since we enter the loop directly
		// condition is at the bottom and we don't know if it will
		// evaluate to true
		int substringOccurrences = -1;
		int indexOfSubstring = -1;
		
		do {
			
			substringOccurrences++;
			indexOfSubstring = text.indexOf(substringToSearch, indexOfSubstring + 1);
			
		} while (indexOfSubstring != -1);
		
		System.out.println(substringToSearch + " appears " + substringOccurrences + " time(s).");
	}
}
