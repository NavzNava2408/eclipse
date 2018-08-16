package org.seleniumhq.selenium.selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelStuff {
	
	private static XSSFSheet WSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile(String Path, int sheetIndex) {
		try {
			FileInputStream EFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(EFile);
			WSheet = ExcelWBook.getSheetAt(sheetIndex);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static XSSFSheet getExcelWSheet() {
		return WSheet;
	}
	
	public static String getCellData(int RowNum, int ColNum) {
		try {
			Cell = WSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

}
