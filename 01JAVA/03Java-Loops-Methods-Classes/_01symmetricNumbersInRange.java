package homework;

import java.util.Scanner;

public class _01symmetricNumbersInRange {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter range start:");
		int start = reader.nextInt();
		
		System.out.println("Enter range end:");
		int end = reader.nextInt();
		
		String currentNum = null;
		boolean symmetric = true;
		
		for (int i = start; i <= end; i++) {
			
			currentNum = Integer.toString(i);
			symmetric = true;
			
			for (int j = 0; j < currentNum.length() / 2; j++) {
				
				if (currentNum.charAt(j) != currentNum.charAt(currentNum.length() - 1 - j)) {
					symmetric = false;
				}
			}
			
			if (symmetric) {
				System.out.println(currentNum);
			}
		}
	}
}
