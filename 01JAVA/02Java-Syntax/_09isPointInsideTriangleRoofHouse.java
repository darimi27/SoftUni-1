package homework;

import java.util.Scanner;

public class _09isPointInsideTriangleRoofHouse {

	static final double FigureTop = 8.5;
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
		
		boolean inFigure = xCoord >= FigureLeft && xCoord <= FigureRight &&
						   yCoord >= FigureTop && yCoord <= FigureBottom;
		
		boolean inHole = xCoord > HoleLeft && xCoord < HoleRight &&
						 yCoord > HoleTop && yCoord < HoleBottom;
						 
		boolean inRoof = isPointInsideTriangle(xCoord, yCoord);
		
		if ((inFigure && !inHole) || inRoof) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}
	
	// the black box method
	// magic in progress
	// do not change
	public static boolean isPointInsideTriangle(double xCoord, double yCoord) {		
		// roof coordinates
		double aX = 12.5;
		double aY = 8.5;
		double bX = 22.5;
		double bY = 8.5;
		double cX = 17.5;
		double cY = 3.5;
		
		double[] vectorAB = { bY - aY, -bX + aX };
		double[] vectorBC = { cY - bY, -cX + bX };
		double[] vectorAC = { aY - cY, -aX + cX };
		
		double[] vectorAP = { xCoord - aX, yCoord - aY };
		double[] vectorBP = { xCoord - bX, yCoord - bY };
		double[] vectorCP = { xCoord - cX, yCoord - cY };
		
		double dot1 = vectorAB[0] * vectorAP[0] + vectorAB[1] * vectorAP[1];
		double dot2 = vectorBC[0] * vectorBP[0] + vectorBC[1] * vectorBP[1];
		double dot3 = vectorAC[0] * vectorCP[0] + vectorAC[1] * vectorCP[1];
		
		boolean result = 0 <= dot1 && 0 <= dot2 && 0 <= dot3;
		
		return result;
	}

}
