package homework;

import java.util.Scanner;

public class _05countAllWords {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter text and the program will return the word count:");
		
		String[] words = reader.nextLine().split("\\W+");
		
		System.out.println("Words count: " + words.length);

	}

}