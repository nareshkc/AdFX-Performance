package com.weather.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import AppiumTest.Driver;



public class WriteResultintoExcel extends Driver {

    public void enterResult(String sheetName, String Adsize, String AdLocation,double time, int rowIndex, int SizeColIndex, int LocationColIndex, int TimeColIndex) {

	try {

	    FileInputStream file = new FileInputStream(new File(properties.getProperty("ExcelFilePath")));
	    HSSFWorkbook workbook = new HSSFWorkbook(file);

	    HSSFSheet sheet = workbook.getSheet(sheetName);

	    Cell searchText3 = sheet.getRow(rowIndex).getCell(SizeColIndex);
	    searchText3.setCellValue(Adsize);

	    Cell searchText4 = sheet.getRow(rowIndex).getCell(LocationColIndex);
	    searchText4.setCellValue(AdLocation);
	    
	    Cell searchText5 = sheet.getRow(rowIndex).getCell(TimeColIndex);
	    searchText5.setCellValue(time);

	    file.close();

	    FileOutputStream outFile = new FileOutputStream(new File(properties.getProperty("ExcelFilePath")));
	    workbook.write(outFile);
	    outFile.close();

	} catch (FileNotFoundException fnfe) {
	    fnfe.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
    }
}
