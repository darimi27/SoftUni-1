package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09combineLetters {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Enter first list of letters separated by space:");
		String[] firstLine = reader.nextLine().split(" ");
		
		System.out.println("Enter second list of letters separated by space:");
		String[] secondLine = reader.nextLine().split(" ");
		
		// converting the input strings to characters
		List<Character> firstList = new ArrayList<Character>();
		for (int i = 0; i < firstLine.length; i++) {
			firstList.add(firstLine[i].charAt(0));
		}
		
		List<Character> secondList = new ArrayList<Character>();
		for (int i = 0; i < secondLine.length; i++) {
			secondList.add(secondLine[i].charAt(0));
		}
		
		secondList.removeAll(firstList);
		
		firstList.addAll(secondList);
		
		for (Character ch : firstList) {
			System.out.print(ch + " ");
		}
		
	}

}
