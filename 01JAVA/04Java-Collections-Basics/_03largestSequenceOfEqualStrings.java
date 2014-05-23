package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03largestSequenceOfEqualStrings {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter an array of strings separated by space");
		String[] elements = reader.nextLine().split(" ");
		
		Map<String, Integer> uniqueElementCount = new HashMap<>();
		
		for (String str : elements) {
			
			if (uniqueElementCount.containsKey(str)) {
				
				int newValue = uniqueElementCount.get(str) + 1;
				uniqueElementCount.put(str, newValue);
				
			} else {				
				uniqueElementCount.put(str, 1);
			}
		}
		
		String mostFrequentElement = "";
		int frequency = 0;
		for (String key : uniqueElementCount.keySet()) {
			
			int repeatCount = uniqueElementCount.get(key);
			if (repeatCount > frequency) {
				frequency = repeatCount;
				mostFrequentElement = key;
			}
		}
		
		for (int i = 0; i < frequency; i++) {
			System.out.print(mostFrequentElement + " ");
		}

	}

}
