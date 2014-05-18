package homework;

import java.util.Scanner;

public class _03PointsInsideFigure {
	
	static final double FigureTop = 6.0;
	static final double FigureRight = 22.5;
	static final double FigureBottom = 13.5;
	static final double FigureLeft = 12.5;
	
	static final double HoleTop = 8.5;
	static final double HoleRight = 20.0;
	static final double HoleBottom = 13.5;
	static final double HoleLeft = 17.5;
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter point coordinates separated by space");
		System.out.println("Depending on OS config the decimal separator is '.' or ','");
		
		double xCoord = reader.nextDouble();
		double yCoord = reader.nextDouble();
		
		boolean inFigure = xCoord >= FigureLeft && xCoord <= FigureRight && yCoord >= FigureTop && yCoord <= FigureBottom;
						
		boolean inHole = xCoord > HoleLeft && xCoord < HoleRight && yCoord > HoleTop && yCoord < HoleBottom;
		
		if (inFigure && !inHole) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

}
