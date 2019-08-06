package ExcelFunctionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static Student readExcel(XSSFSheet sheet,int i)
	{
		DataFormatter df =new DataFormatter();
		Student s=new Student();
		
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell0=row.getCell(0);
		String cellvalue0=df.formatCellValue(cell0);
		s.setSid(Integer.parseInt(cellvalue0));
		XSSFCell cell1=row.getCell(1);
		String cellvalue1=cell1.getStringCellValue();
		s.setName(cellvalue1);
		XSSFCell cell2=row.getCell(2);
		String cellvalue2=df.formatCellValue(cell2);
		s.setJava(Integer.parseInt(cellvalue2));
		XSSFCell cell3=row.getCell(3);
		String cellvalue3=df.formatCellValue(cell3);
		s.setSelenium(Integer.parseInt(cellvalue3));
		return s;
		
		
	}
	public static void writeExcel(File f,XSSFWorkbook wb,XSSFSheet sheet,Student s)
	{
		try{
	
			for(int i=1;i<4;i++)
			{
			
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.createCell(4);
			cell.setCellValue(s.getAverage());
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
	