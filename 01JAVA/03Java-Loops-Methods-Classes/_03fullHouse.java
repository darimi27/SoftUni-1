package homework;

public class _03fullHouse {
	
	static String[] CardFaces = { 
								"2", "3", "4", "5", "6", "7",
								"8", "9", "10", "J", "Q", "K", "A"
								};
	
	static char[] CardSuits = { '\u2660', '\u2665', '\u2666', '\u2663' };
	
	static int FullHouseCount = 0;
	
	static StringBuilder currentHand = new StringBuilder(9);
	
	public static void main(String[] args) {
		
		generateFullHouse();
		System.out.println("Total number of full houses: " +  FullHouseCount);
	}

	public static void generateFullHouse() {
		generateFirstThreeCards();
	}
	
	public static void generateFirstThreeCards() {
		
		for (int first3cards = 0; first3cards < CardFaces.length; first3cards++) {
			
			for (int card1suit = 0; card1suit < CardSuits.length; card1suit++) {
				
				for (int card2suit = card1suit + 1; card2suit < CardSuits.length; card2suit++) {
					
					for (int card3suit = card2suit + 1; card3suit < CardSuits.length; card3suit++) {
						
						currentHand.setLength(0);
						
						currentHand.append(CardFaces[first3cards]);
						currentHand.append(CardSuits[card1suit]);
						currentHand.append(' ');
						
						currentHand.append(CardFaces[first3cards]);
						currentHand.append(CardSuits[card2suit]);
						currentHand.append(' ');
						
						currentHand.append(CardFaces[first3cards]);
						currentHand.append(CardSuits[card3suit]);
						currentHand.append(' ');
						
						generateNextTwoCards(first3cards);
					}
				}
			}
		}
	}
	
	public static void generateNextTwoCards(int currentlyUsedCard) {
		
		for (int next2cards = 0; next2cards < CardFaces.length; next2cards++) {
			
			if (next2cards != currentlyUsedCard) {
				
				for (int card4suit = 0; card4suit < CardSuits.length; card4suit++) {
					
					for (int card5suit = card4suit + 1; card5suit < CardSuits.length; card5suit++) {
						
						FullHouseCount++;
						
						System.out.print(currentHand.toString());
						
						System.out.printf("%1$s%2$c %1$s%3$c%n",
											CardFaces[next2cards],
											CardSuits[card4suit],
											CardSuits[card5suit]);
					}
				}
			}
		}
	}
}
