package Basics;
import java.io.*;


import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.*;
public class InputFromFile 
{
	public static void main(String args[])
{
	
	try
	{
	File f=new File("C:\\Users\\anmol.srivastava\\Desktop\\example.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);//only data part of excel file excluding menus and all
	XSSFSheet s=wb.getSheet("Sheet1");
	XSSFRow row0=s.getRow(0);
	XSSFCell cell00=row0.getCell(0);
	String value00=cell00.getStringCellValue();
	System.out.println("Data: "+value00);
	FileOutputStream fos=new FileOutputStream(f);
	cell00.setCellValue("NAME");
	wb.write(fos);
	/*XSSFCell cell04=row0.getCell(4);
	FileOutputStream fos=new FileOutputStream(f);
	cell04.setCellValue("anmol");
	wb.write(fos);*/
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
