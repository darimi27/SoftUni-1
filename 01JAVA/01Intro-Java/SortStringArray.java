package homework;

import java.util.Scanner;
import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number of strings you want to sort:");
		int numStrings = Integer.parseInt(reader.nextLine());
		
		String[] stringArr = new String[numStrings];
		
		System.out.println("Enter each string:");
		
		for (int i = 0; i < stringArr.length; i++) {
			if (reader.hasNextLine()) {
				stringArr[i] = reader.nextLine();
			}		
		}
		
		System.out.println("Array before sort: " + Arrays.toString(stringArr));
		
		Arrays.sort(stringArr);
		
		System.out.println("Array after sort: " + Arrays.toString(stringArr));

	}

}
