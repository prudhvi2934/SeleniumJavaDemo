package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password) {
		System.out.println(username+" | "+password);
	}
	
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String path = "E:\\Eclipse Workspace\\SeleniumMavenProject\\excel\\data.xlsx";
		String sheet = "Sheet1";
		Object data[][]= testData(path,sheet);
		
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount=excel.getRowCount();
		int colCount=excel.getColoumCount(1);
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData=excel.getCellDataString(i, j);
				data[i-1][j] = cellData;
			}
		}
		return data;
	}

}
