package homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06randomHand {

	static Scanner reader = new Scanner(System.in);
	static Random handGenerator = new Random();
	
	static String[] CardFaces = { 
								"2", "3", "4", "5", "6", "7",
								"8", "9", "10", "J", "Q", "K", "A"
								};

	static char[] CardSuits = { '\u2660', '\u2665', '\u2666', '\u2663' };
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of hands to be generated:");
		int numberOfHands = validateInput();
		
		
		for (int i = 0; i < numberOfHands; i++) {
			System.out.println(generateRandomHand());
		}
		
		System.out.println(numberOfHands + " random hands generated.");
	}
	
	static int validateInput() {
		boolean isInputCorrect = false;
		int inputNumber = 0;
		
		while (!isInputCorrect) {
			if (reader.hasNextInt()) {
				inputNumber = reader.nextInt();
				isInputCorrect = true;
			} else {
				System.out.println("Enter an integer number!");
				reader.next();
			}
		}
		
		return inputNumber;
	}
	
	static String generateRandomHand() {
		StringBuilder hand = new StringBuilder();
		int cardFaceIndex, cardSuitIndex;
		
		// a list to store already generated cards
		// cannot have to same cards in one hand
		ArrayList<String> usedCards = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			cardFaceIndex = handGenerator.nextInt(CardFaces.length);
			cardSuitIndex = handGenerator.nextInt(CardSuits.length);
			
			// if the list contains this card we generate a new one
			// then we store the card in the list so we do not generate the
			// same card again
			while (usedCards.contains(cardFaceIndex + "-" + cardSuitIndex)) {
				cardFaceIndex = handGenerator.nextInt(CardFaces.length);
				cardSuitIndex = handGenerator.nextInt(CardSuits.length);
			}
			
			usedCards.add(cardFaceIndex + "-" + cardSuitIndex);
			
			hand.append(CardFaces[cardFaceIndex]);
			hand.append(CardSuits[cardSuitIndex]);
			hand.append(" ");
		}
		
		return hand.toString();
	}

}
