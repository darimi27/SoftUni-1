package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12cardFaceFrequency {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter face/suit pairs separated by space");
		String[] cards = reader.nextLine().split(" ");
		
		Map<String, Integer> faces = new HashMap<>();
		
		for (int i = 0; i < cards.length; i++) {
			
			String cardFace = cards[i].substring(0, cards[i].length() - 1);
			if (faces.containsKey(cardFace)) {
				
				int newValue = faces.get(cardFace) + 1;
				faces.put(cardFace, newValue);
			} else {
				
				faces.put(cardFace, 1);
			}
		}
		
		double percentagePerCards = (double)100 / cards.length;
		
		for (String face : faces.keySet()) {
			
			double percentagePerFace = percentagePerCards * faces.get(face);
			System.out.printf("%s -> %.2f%%\n", face, percentagePerFace);
		}

	}

}
