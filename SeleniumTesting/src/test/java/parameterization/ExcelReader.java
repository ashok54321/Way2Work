package parameterization;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelReader {

	public String path;
	public FileInputStream fis=null;
	public FileOutputStream fos=null;
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheet=null;
	private XSSFRow row=null;
	private XSSFCell cell=null;
	
	public ExcelReader(String path) {
		
		this.path=path;
		try {
			fis=new FileInputStream(path);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheetAt(0);
			fis.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//returns the row count in a sheet
	public int getRowCount(String sheetName) {
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else {
			sheet=workbook.getSheetAt(index);
			int number=sheet.getFirstRowNum()+1;
			return number;
		}
		
	}
	
	
	
	
	//own method
	public int getColCount(String sheetName) {
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else {
			sheet=workbook.getSheetAt(index);
			int number=sheet.getFirstRowNum()+1;
			return number;
		}
		
	}
	
	/*//returns the data from a cell
	public String getCellData(String sheetName, int ColNum, int rowNum) {
		
		try {
			if(rowNum<=0)
				return "";
			
			int index=workbook.getSheetIndex(sheetName);
			if(index==-1)
				return "";
			
			sheet=workbook.getSheetAt(index);
			row=sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell=row.getCell(ColNum);
			if(cell==null)
				return "";
			
			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
				return cell.getStringCellValue();
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC || cell.getCellType()==Cell.class)
				
				
				
				
			
		}
	}*/
	
}
