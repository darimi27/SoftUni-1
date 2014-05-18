package homework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class _10creatingSvgHouse {
	
	static StringBuilder htmlDocument = new StringBuilder();
	static String[] dots = {
		"100 97",
		"116 70",
		"125 60",
		"125 145",
		"131.3 91.5",
		"135 69",
		"150 60",
		"150.2 48.3",
		"151.1 70.1",
		"163.3 140.3",
		"164 54",
		"175 30",
		"175.1 40.1",
		"175 135",
		"176 85",
		"177.2 91.2",
		"18.6 3.9",
		"186 60",
		"196.93 134",
		"200 60",
		"210 75",
		"210 135",
		"213 55",
		"214.5 97",
		"220 140",
		"225 85",
		"230 75",
		"230.01 11.01"

	};

	public static void main(String[] args) {
		
		generateOpeningHTML();
		generateCoordinateSystem();
		generateHouse();
		
		for (int i = 0; i < dots.length; i++) {
			String[] currentDot = dots[i].split(" ");
			double x = Double.parseDouble(currentDot[0]);
			double y = Double.parseDouble(currentDot[1]);
			
			generateDots(x, y);
		}
		
		generateClosingHTML();
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("SvgHouse.html", "UTF-8");
			writer.print(htmlDocument.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
			
		}
		
		
	}
	
	public static void generateOpeningHTML() {
		htmlDocument.append("<!doctype html>\n");
		htmlDocument.append("<html>\n");
		htmlDocument.append("<head>\n");
		htmlDocument.append("<title>An SVG House</title>\n");
		htmlDocument.append("</head>\n");
		htmlDocument.append("<body>\n");
		htmlDocument.append("<svg width=\"250\" height=\"180\">\n");
	}
	
	public static void generateClosingHTML() {
		htmlDocument.append("</svg>\n");
		htmlDocument.append("</body>\n");
		htmlDocument.append("</html>");
	}
	
	public static void generateCoordinateSystem() {
		int[] lineXCoords = { 100, 125, 150, 175, 200, 225 };
		int[] lineYCoords = { 35, 60, 85, 110, 135, 160 };
		
		for (int i = 0; i < lineXCoords.length; i++) {
			htmlDocument.append("<text x=\"" + Integer.toString(lineXCoords[i] - 10) +
								"\" y=\"15\" fill=\"black\">" +
								Integer.toString(lineXCoords[i]) + "</text>\n");
			
			htmlDocument.append("<line x1=\"" + Integer.toString(lineXCoords[i]) + "\" " +
								"y1=\"10\" " +
								"x2=\"" + Integer.toString(lineXCoords[i]) + "\" " +
								"y2=\"170\" " +
								"stroke=\"rgb(125,185,235)\" " +
								"stroke-width=\"1\" " +
								"stoke-linecap=\"round\"" +
								"stroke-dasharray=\"2, 5\" />\n");
		}
		
		for (int i = 0; i < lineYCoords.length; i++) {
			htmlDocument.append("<text y=\"" + Integer.toString(lineYCoords[i]) +
								"\" x=\"0\" fill=\"black\">" +
								Integer.toString(lineYCoords[i]) + "</text>\n");
			
			htmlDocument.append("<line x1=\"10\" " +
								"y1=\"" + Integer.toString(lineYCoords[i]) + "\" " +
								"x2=\"250\" " +
								"y2=\"" + Integer.toString(lineYCoords[i]) + "\" " +
								"stroke=\"rgb(125,185,235)\" " +
								"stroke-width=\"1\" " +
								"stoke-linecap=\"round\"" +
								"stroke-dasharray=\"2, 5\" />\n");
		}
		
		
	}
	
	public static void generateHouse() {
		htmlDocument.append("<rect x=\"125\" y=\"85\" width=\"50\" height=\"50\" " +
				"style=\"fill: rgb(200,200,200); stroke: rgb(30, 90, 160); stroke-width: 2\" />\n");
		
		htmlDocument.append("<rect x=\"200\" y=\"85\" width=\"25\" height=\"50\" " +
				"style=\"fill: rgb(200,200,200); stroke: rgb(30, 90, 160); stroke-width: 2\" />\n");
		
		htmlDocument.append("<polygon points=\"125,85 225,85 175,35\" " +
				"style=\"fill:rgb(200,200,200); stroke:rgb(30, 90, 160); stroke-width:2\" />\n");
	}
	
	public static void generateDots(double xCoord, double yCoord) {
		
		if (isPointInsideHouse(xCoord, yCoord)) {
			htmlDocument.append("<circle cx=\"" + xCoord + "\" cy=\"" + yCoord + "\" r=\"3\"" +
						"stroke=\"black\" stroke-width=\"1\" fill=\"black\" />\n");
			
		} else {
			htmlDocument.append("<circle cx=\"" + xCoord + "\" cy=\"" + yCoord + "\" r=\"3\"" +
					"stroke=\"black\" stroke-width=\"1\" fill=\"gray\" />\n");
		}
	}
	
	public static boolean isPointInsideHouse(double xCoord, double yCoord) {		
		// roof coordinates
		double aX = 125;
		double aY = 85;
		double bX = 225;
		double bY = 85;
		double cX = 175;
		double cY = 35;
		
		double[] vectorAB = { bY - aY, -bX + aX };
		double[] vectorBC = { cY - bY, -cX + bX };
		double[] vectorAC = { aY - cY, -aX + cX };
		
		double[] vectorAP = { xCoord - aX, yCoord - aY };
		double[] vectorBP = { xCoord - bX, yCoord - bY };
		double[] vectorCP = { xCoord - cX, yCoord - cY };
		
		double dot1 = vectorAB[0] * vectorAP[0] + vectorAB[1] * vectorAP[1];
		double dot2 = vectorBC[0] * vectorBP[0] + vectorBC[1] * vectorBP[1];
		double dot3 = vectorAC[0] * vectorCP[0] + vectorAC[1] * vectorCP[1];
		
		boolean isPointInsideRoof = 0 <= dot1 && 0 <= dot2 && 0 <= dot3;
		
		boolean isPointInFigure = xCoord >= 125 && xCoord <= 225 && 
								yCoord >= 85 && yCoord <= 135;

	   boolean isPointInHole = xCoord > 175 && xCoord < 200 && 
			   					yCoord > 85 && yCoord < 135;
		
		return (isPointInFigure && !isPointInHole) || isPointInsideRoof;
	}
}
