package homework;

import java.util.Scanner;

public class _05angleUnitConverter {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numberOfOperations = Integer.parseInt(reader.nextLine());
		
		String[] operations = new String[numberOfOperations];
		
		for (int i = 0; i < operations.length; i++) {
			operations[i] = reader.nextLine();
		}
		
		processInput(operations);
	}
	
	public static void processInput(String[] input) {
		
		String[] currentOperation = new String[2];
		double initialValue;
		double convertedValue;
		
		for (int i = 0; i < input.length; i++) {
			
			currentOperation = input[i].split(" ");
			initialValue = Double.parseDouble(currentOperation[0]);
			
			if (currentOperation[1].equalsIgnoreCase("deg")) {
				convertedValue = convertDegreesToRadians(initialValue);
			} else {
				convertedValue = convertRadiansToDegrees(initialValue);
			}
			
			System.out.printf("%.4f %s is %.4f in %s%n",
								initialValue,
								currentOperation[1],
								convertedValue,
								currentOperation[1].equalsIgnoreCase("deg") ? "rad" : "deg");
		}
	}
	
	public static double convertDegreesToRadians(double degrees) {
		
		double radians = (degrees * Math.PI) / 180;
		
		return radians;
	}
	
	public static double convertRadiansToDegrees(double radians) {
		
		double degrees = (radians * 180) / Math.PI;
		
		return degrees;
	}

}
