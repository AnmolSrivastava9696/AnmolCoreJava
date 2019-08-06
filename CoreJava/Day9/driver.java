package ExcelFunctionality;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class driver 
{
	public static void main(String args[]){
	try{
		File f=new File("C:\\Users\\anmol.srivastava\\Desktop\\Assesment.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		ArrayList<Student> saaray=new ArrayList<>();
		for(int i=1;i<4;i++)
		{
        Student s1=Excel.readExcel(sheet,i);
		saaray.add(s1);
		}
		for(Student s:saaray)
		{
			s.CalculateAverage();
			s.calculateGreatest();
			Excel.writeExcel(f, wb, sheet, s);
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
