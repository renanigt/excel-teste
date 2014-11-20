package br.com.renanigt.exec;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Principal {

	public static void main(String[] args) {
			Workbook workbook;
			try {
				workbook = WorkbookFactory.create(new File("/home/renan/Desktop/curva1.xlsx"));
				Row row = workbook.getSheetAt(0).getRow(9);
				System.out.println(row.getCell(4).getNumericCellValue());
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
