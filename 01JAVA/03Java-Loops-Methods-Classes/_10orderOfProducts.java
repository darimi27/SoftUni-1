package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _10orderOfProducts {

	public static void main(String[] args) {
		
		// more on maps - http://tutorials.jenkov.com/java-collections/map.html
		Map<String, Integer> order = new HashMap<String, Integer>();
		List<Product> productPrices = new ArrayList<Product>();
		
		try (BufferedReader productReader = new BufferedReader(new FileReader("10input.txt")); 
			 BufferedReader orderReader = new BufferedReader(new FileReader("10order.txt"))) {
			
			String[] keyValuePair = new String[2];
			
			// reading the products
			String line = productReader.readLine();			
			while (line != null) {
				keyValuePair = line.split(" ");
				productPrices.add(new Product(keyValuePair[0], new BigDecimal(keyValuePair[1])));
				line = productReader.readLine();				
			}
			
			// reading the order
			line = orderReader.readLine();			
			while (line != null) {
				keyValuePair = line.split(" ");
				
				if (order.containsKey(keyValuePair[1])) {
					int newValue = order.get(keyValuePair[1]) + Integer.parseInt(keyValuePair[0]);
					order.put(keyValuePair[1], newValue);
					
				} else {
					
					order.put(keyValuePair[1], Integer.parseInt(keyValuePair[0]));
				}				
				
				line = orderReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Cannot read from 10input.txt or 10order.txt");
		}
		
		// calculate order price
		BigDecimal totalOrderPrice = new BigDecimal("0");
		
		// get every product from the order
		// then find the matching product from the list with products
		// then add to the total price the quantity of the ordered product
		// by the price for that product
		for (String productToOrder : order.keySet()) {
			
			for (Product product : productPrices) {
				
				if (product.getName().equalsIgnoreCase(productToOrder)) {
					
					totalOrderPrice = totalOrderPrice.
							add(product.getPrice().
							multiply(new BigDecimal(order.get(productToOrder))));
				}
			}
		}
		
		System.out.println("Total order value: " + totalOrderPrice);
		System.out.println("Trying to write to file 10output.txt");
		
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("10output.txt"))) {
			
			fileWriter.write("Total order value: " + totalOrderPrice.toString());
			
		} catch (IOException e) {
			System.out.println("Error when writing to file 10output.txt");
		}
	}

}
