package homework;

import java.util.Scanner;

public class _01RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the lenght of side a:");
		int a = reader.nextInt();
		System.out.println("Enter the lenght of side b:");
		int b = reader.nextInt();
		
		int result = a * b;
		System.out.println("The are of the rectangle is: " + result);
	}

}