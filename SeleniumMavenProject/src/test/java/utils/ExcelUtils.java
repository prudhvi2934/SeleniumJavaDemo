package utils;

import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		//getCellDataString();
		//getCellDataNumeric();
	}

	public static int getRowCount() {


		int rowcount=sheet.getPhysicalNumberOfRows();
		//System.out.println("RowCount = "+rowcount);

		return rowcount;
	}
	
	public static int getColoumCount(int rowNum) {


		int colcount=sheet.getRow(rowNum).getPhysicalNumberOfCells();
		//System.out.println("ColCount = "+colcount);
		
		return colcount;
	}

	public static String getCellDataString(int rowNum,int colNum) {

		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("CellData : "+cellData);
		
		return cellData;

	}

	public static void getCellDataNumeric(int rowNum,int colNum) {

		double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("CellData : "+cellData);
	}
}
