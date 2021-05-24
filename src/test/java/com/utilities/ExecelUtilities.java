package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecelUtilities {
@SuppressWarnings("deprecation")
public static Map<String,String> getExcelData() throws FileNotFoundException{
	HashMap<String, String> hashMap = new HashMap<String,String>();
	try {
		FileInputStream FIS = new FileInputStream("E:\\Data\\TestData.xlsx");
		Workbook xssfWorkbook = new XSSFWorkbook(FIS);
		Sheet sheet = xssfWorkbook.getSheet("TC1");
		Row headerrow = sheet.getRow(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i = 1;i<=physicalNumberOfRows;i++) {
			Row valuerow = sheet.getRow(i);
			int physicalNumberOfCells = valuerow.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells;j++) {
				Cell valuecell = valuerow.getCell(j);
				valuecell.setCellType(Cell.CELL_TYPE_STRING);
				String value = valuecell.getStringCellValue();
				hashMap.put(headerrow.getCell(j).getStringCellValue(), value);
			}
			
		}
		
	} catch (Exception e) {
		
	}
	return hashMap;
	
}
}
