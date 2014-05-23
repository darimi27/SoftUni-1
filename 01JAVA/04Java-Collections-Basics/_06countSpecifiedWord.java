package homework;

import java.util.Scanner;

public class _06countSpecifiedWord {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter text:");		
		String[] words = reader.nextLine().split("\\W+");
		
		System.out.println("Enter word to search for:");
		String wordToSearch = reader.nextLine();
		
		int wordCount = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(wordToSearch)) {
				wordCount++;
			}
		}

		System.out.println(wordToSearch + " appears " + wordCount + " time(s).");
	}

}
