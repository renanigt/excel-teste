package br.com.renanigt.exec;

import br.com.renanigt.doc.Spreadsheet;

public class Principal {

	public static void main(String[] args) {
		Spreadsheet sheet = new Spreadsheet("/home/renan/Desktop/curva1.xlsx");
		System.out.println(sheet.readCellAsDoubleAt(0, 9, 4));
	}
	
}
