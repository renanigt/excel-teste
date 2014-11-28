package br.com.renanigt.doc;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Spreadsheet {
	Workbook workbook = null;
	
	public Spreadsheet(String filePath) {
		try {
			workbook = WorkbookFactory.create(new File(filePath));
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readCellAsStringAt(Integer sheet, Integer row, Integer column) {
		return workbook.getSheetAt(sheet).getRow(row).getCell(column).getStringCellValue();
	}

	public Double readCellAsDoubleAt(Integer sheet, Integer row, Integer column) {
		return workbook.getSheetAt(sheet).getRow(row).getCell(column).getNumericCellValue();
	}
	
}
