import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//demo is a test case in selenium test case
public class demo 
{
	public static void main(String args[])
	{
		try{
		//write selenium code here to perform testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anmol.srivastava\\Desktop\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("http://google.com");
		//WebDriver is the interface and ChromeDriver is the class implementing it
		//invoke chromedriver.exe file to invoke due to security concerns not invoked automatically
		//Once browser is invoked we can perform testing
		System.out.println(cd.getTitle());//it checks last webpage which was open
	    //If site is hacked it will be redirected to other site and in such case we have to check that we have landed on the right site
		//Validation capture the URL
		System.out.println(cd.getCurrentUrl());
		//Hence we have not been redirected to other site
		//sort of pre checking 
		//we can get the source code of the page too.Especially useful where right click is disabled for security reasons
		//System.out.println(cd.getPageSource());
		//cd.get("http://www.yahoo.com");
		//Yahoo will be opened above google.We can however navigate back
	    //cd.navigate().back();
	    //cd.navigate().forward();
	    //cd.close();
	    //to close the browser else multiple chrome will open simultaneously
	    //cd.quit();
	    //close closes current browser whereas Quit closes all the chrome opened
	    //especially on child windows where one page opens another tab
	     //cd.findElement(By.name("q")).sendKeys("java");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	}
	

}
