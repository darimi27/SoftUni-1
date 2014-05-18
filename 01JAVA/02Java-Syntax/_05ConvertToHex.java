package homework;

import java.util.Scanner;

public class _05ConvertToHex {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter integer number to convert into hex:");
		
		int numberToConvert = reader.nextInt();
		
		System.out.println("Hex representation: " + Integer.toHexString(numberToConvert));
		System.out.println("And again: " + convertToHex(numberToConvert));
	}

	public static String convertToHex(int number) {
		String hexString = "";
		int remainder = 0;
		
		while (number > 0) {
			remainder = number % 16;
			number /= 16;
			
			switch (remainder) {
				case 10: hexString += "A"; break;
				case 11: hexString += "B"; break;
				case 12: hexString += "C"; break;
				case 13: hexString += "D"; break;
				case 14: hexString += "E"; break;
				case 15: hexString += "F"; break;
				default: hexString += remainder; break;
			}
		}
		
		return new StringBuilder(hexString).reverse().toString();
	}
}