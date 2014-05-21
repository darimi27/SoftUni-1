package homework;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _11excelTableManipulation {

	public static void main(String[] args) {
		// poi library is not in project due to size restriction
		// to see the result add the following .jar files to the build path
		// 1. dom4j-1.6.1.jar
		// 2. poi-3.10-FINAL-20140208.jar
		// 3. poi-ooxml-3.10-FINAL-20140208.jar
		// 4. poi-ooxml-schemas-3.10-FINAL-20140208.jar
		// 5. xmlbeans-2.3.0.jar
		
		Map<String, Double> townIncomePair = new TreeMap<String, Double>();
		
		try {
			Workbook incomeWB = WorkbookFactory.create(new File("incomeReport.xlsx"));
			Sheet sheet = incomeWB.getSheetAt(0);
			
			for (Row row : sheet) {
				
				if (row.getRowNum() == 0 ) {
					continue;
				}
				
				String town = row.getCell(0).getRichStringCellValue().getString();
				double income = row.getCell(5).getNumericCellValue();
				
				if (townIncomePair.containsKey(town)) {
					
					double newValue = townIncomePair.get(town) + income;
					townIncomePair.put(town, newValue);
				} else {
					
					townIncomePair.put(town, income);
				}				
			}
			
		} catch (InvalidFormatException e) {
			System.out.println("The expected format for incomeReport is xlsx");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read incomeReport.xlsx");
			e.printStackTrace();
		}
		
		// print the incomes and sum the total income
		double totalIncome = 0;
		
		for (String town : townIncomePair.keySet()) {
			System.out.printf("%s Total -> %.2f%n", town, townIncomePair.get(town));
			totalIncome += townIncomePair.get(town);
		}
		System.out.println("Grand total -> " + totalIncome);

	}

}
