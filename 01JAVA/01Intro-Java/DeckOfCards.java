// creating a pdf with an external lib iText

package homework;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class DeckOfCards {
	
	static final char Diamonds = '\u2666';	
	static final char Hearts = '\u2665';
	static final char Spades = '\u2660';
	static final char Clubs = '\u2663';	

	public static void main(String[] args) {
		Document doc = new Document();
		
		try {
			PdfWriter.getInstance(doc, new FileOutputStream("Cards.pdf"));
			
			doc.open();
			
			doc.add(createTable(Diamonds, "red"));
			doc.add(createTable(Hearts, "red"));
			doc.add(createTable(Spades, "black"));
			doc.add(createTable(Clubs, "black"));
			
			doc.close();
			
		} catch (Exception e) {
			System.out.println("There was an error: " + e.getMessage());
		}
	}
	
	public static PdfPTable createTable(char suit, String color) {
		// format table
		PdfPTable table = new PdfPTable(13);
		table.setWidthPercentage(100);
		table.setSpacingAfter(8f);
		
		table.getDefaultCell().setFixedHeight(65f);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		
		// format font
		// for some reason this does not work
		// throws IO Exception and Document Exception
		// BaseFont baseFnt = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
		Font myFont = new Font();
		
		if (color == "red") {
			myFont.setColor(BaseColor.RED);
		}
		
		// fill the table with cells
		for (int num = 1; num < 14; num++) {
			
			switch (num) {
			case 1:
				table.addCell(new Paragraph("A " + suit, myFont));
				break;
			case 11:
				table.addCell(new Paragraph("J " + suit, myFont));
				break;
			case 12:
				table.addCell(new Paragraph("Q " + suit, myFont));
				break;
			case 13:
				table.addCell(new Paragraph("K " + suit, myFont));
				break;
			default:
				table.addCell(new Paragraph(num + " " + suit, myFont));
				break;
			}
		}
		
		return table;
	}
}
