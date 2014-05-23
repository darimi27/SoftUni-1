package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02sequenceOfEqualStrings {
	
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
		
		for (String key : uniqueElementCount.keySet()) {
			
			int repeatCount = uniqueElementCount.get(key);
			for (int i = 0; i < repeatCount; i++) {
				System.out.print(key + " ");
			}
			System.out.println();
		}
	}

}
