package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "E:\\Eclipse Workspace\\SeleniumMavenProject\\excel\\data.xlsx";
		String sheet = "Sheet1";
		ExcelUtils excel = new ExcelUtils(path, sheet);
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumeric(1, 1);
		
	}

}
