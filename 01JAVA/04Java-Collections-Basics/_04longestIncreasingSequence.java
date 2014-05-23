package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04longestIncreasingSequence {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter an array of integers separated by space:");
		String[] elementsAsString = reader.nextLine().split(" ");
		
		int[] parsedElements = new int[elementsAsString.length];
		for (int i = 0; i < parsedElements.length; i++) {
			parsedElements[i] = Integer.parseInt(elementsAsString[i]);
		}
		
		List<String> sequences = new ArrayList<String>();
		sequences.add(parsedElements[0] + " ");
		
		for (int i = 1; i < parsedElements.length; i++) {
			
			// we have a sequence so we take the last added element
			// in the list and we change its value to contain the
			// next element in the increasing sequence
			if (parsedElements[i] > parsedElements[i-1]) {
				int listSize = sequences.size();
				String newValue = sequences.get(listSize-1) + parsedElements[i] + " ";
				sequences.set(listSize-1, newValue);
			} else {
				
				sequences.add(parsedElements[i] + " ");
			}
		}
		
		int longestSequenceSize = 0;
		String longestSequence = "";
		
		for (String sequence : sequences) {
			System.out.println(sequence);
			
			if (sequence.length() > longestSequenceSize) {
				longestSequenceSize = sequence.length();
				longestSequence = sequence;
			}
		}
		
		System.out.println("Longest: " + longestSequence);
	}

}
