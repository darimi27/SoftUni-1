package homework;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10extractUniqueWords {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter text from which to extract the unique words:");
		String[] text = reader.nextLine().toLowerCase().split("\\W+");
		
		Set<String> uniqueWords = new TreeSet<String>();
		for (String word : text) {
			uniqueWords.add(word);
		}
		
		for (String unique : uniqueWords) {
			System.out.print(unique + " ");
		}

	}

}
