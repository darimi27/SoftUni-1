package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08sumNumbersFromFile {

	public static void main(String[] args) {
		
		try (BufferedReader fileReader = new BufferedReader(
										new FileReader("08input.txt"))) {
			
			String line = fileReader.readLine();
			int totalSum = 0;
			
			System.out.print("Numbers:");
			while (line != null) {
				System.out.print(" + " + line);
				totalSum += Integer.parseInt(line);
				line = fileReader.readLine();
			}
			System.out.println();
			System.out.println("Total sum: " + totalSum);
			
		} catch (IOException e) {
			System.out.println("Cannot read the input file");
		}

	}

}
