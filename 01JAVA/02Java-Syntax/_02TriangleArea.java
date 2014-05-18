package homework;

import java.util.Scanner;

public class _02TriangleArea {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter three point to calculate the are of a triangle");
		
		System.out.println("Enter coordinate for point A separated by space:");
		int[] pointA = parseInput();
		
		System.out.println("Enter coordinate for point B separated by space:");
		int[] pointB = parseInput();
		
		System.out.println("Enter coordinate for point C separated by space:");		
		int[] pointC = parseInput();
		
		int triangleArea = calcTriangleArea(pointA, pointB, pointC);
		System.out.println("The area of the triangle is: " + triangleArea);
	}
	
	public static int[] parseInput() {
		String[] point = reader.nextLine().split("\\s+", 2);
		
		int[] result = new int[2];
		result[0] = Integer.parseInt(point[0]);
		result[1] = Integer.parseInt(point[1]);
		
		return result;
	}
	
	public static int calcTriangleArea(int[] point1, int[] point2, int[] point3) {
		double result = 0;
		
		result = point1[0] * (point2[1] - point3[1]) + point2[0] * (point3[1] - point1[1]) + point3[0] * (point1[1] - point2[1]);
		result = Math.abs(result) / 2;
		
		return (int)result;
	}

}