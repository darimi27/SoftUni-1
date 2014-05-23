package homework;

import java.util.Arrays;
import java.util.Scanner;

public class _01sortArrayOfNumbers {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements:");
		int elementsCount = Integer.parseInt(reader.nextLine());
		
		System.out.println("Enter elements separated by space:");
		String[] elements = reader.nextLine().split(" ");	
		
		int[] parsedElements = new int[elements.length];
		for (int i = 0; i < parsedElements.length; i++) {
			parsedElements[i] = Integer.parseInt(elements[i]);
		}
		
		Arrays.sort(parsedElements);
		
		Arrays.stream(parsedElements).forEach(x -> System.out.print(x + " "));
	}

}
