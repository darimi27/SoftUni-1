package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _11mostFrequentWord {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter text from which to word frequency:");
		String[] text = reader.nextLine().toLowerCase().split("\\W+");
		
		Map<String, Integer> uniqueWordFrequency = new HashMap<String, Integer>();
		for (int i = 0; i < text.length; i++) {
			
			String currentWord = text[i];
			if (uniqueWordFrequency.containsKey(currentWord)) {
				
				int newValue = uniqueWordFrequency.get(currentWord) + 1;
				uniqueWordFrequency.put(currentWord, newValue);
				
			} else {
				uniqueWordFrequency.put(text[i], 1);
			}
		}
		
		List<String> mostFrequentWord = new ArrayList<String>();
		int maxFrequency = 0;
		for (String key : uniqueWordFrequency.keySet()) {
			
			if (uniqueWordFrequency.get(key) > maxFrequency) {
				maxFrequency = uniqueWordFrequency.get(key);
				mostFrequentWord.clear();
				mostFrequentWord.add(key);
				
			} else if (uniqueWordFrequency.get(key) == maxFrequency) {
				
				mostFrequentWord.add(key);
			} else {
				continue;
			}
		}
		
		Collections.sort(mostFrequentWord);
		for (String word : mostFrequentWord) {
			System.out.println(word + " -> " + maxFrequency + " time(s)");
		}
	}

}
