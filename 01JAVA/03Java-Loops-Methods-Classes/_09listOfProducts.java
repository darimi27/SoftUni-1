package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _09listOfProducts {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		
		try (BufferedReader fileReader = new BufferedReader(
										new FileReader("09input.txt"))) {
			
			
			String[] currentProduct = new String[2];
			String line = fileReader.readLine();
			
			while (line != null) {
				currentProduct = line.split(" ");
				products.add(new Product(currentProduct[0], new BigDecimal(currentProduct[1])));
				line = fileReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Cannot read from file.");
			System.out.println(e.getMessage());
		}
		
		// this is possible since I implemented the
		// Comparable interface in the Product class
		Collections.sort(products);
		
		for (Product item : products) {
			System.out.println(item.toString());
		}
		
		System.out.println("Not trying to write to file 09output.txt");
		
		try (BufferedWriter fileWriter = new BufferedWriter(
										new FileWriter("09output.txt", false))) {
			
			for (Product item : products) {
				fileWriter.write(item.toString());
				fileWriter.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Could not write to file 09output.txt");
		}
		
		System.out.println("File written in project directory");
	}

}
