package gate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Gateeee {
	

	@Test    (enabled=false)  //url check
	public void mainurl()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.aceenggacademy.com");
			driver.manage().window().maximize();
			System.out.println("title of page is: " + driver.getTitle());
			driver.quit();
			System.out.println("Main url working");
	}
	
	
	
	@Test    (enabled=true)   //url check
	public void aboutus() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.aceenggacademy.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//driver.findElement(By.partialLinkText("ABOUT")).click();
			Select dropdown=new Select(driver.findElement(By.partialLinkText("ABOUT")));
			Thread.sleep(2000);
			dropdown.selectByVisibleText("ABOUT ACE");
			
			//Thread.sleep(2000);
			//driver.findElement(By.partialLinkText("ABOUT")).click();
			
			//System.out.println(dropdown.selectByVisibleText("ABOUT ACE"));
			//System.out.println("title of page is: " + driver.getTitle());
			
			driver.quit();
			
		System.out.println("about link working properly");
	}
	
	
	
	
	
	@Test    (enabled=false)   //
	public void enrollement()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.aceenggacademy.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("ENROLLMENT")).click();
			System.out.println("title of page is: " + driver.getTitle());
			
			driver.quit();
			
		System.out.println("Enrollement link working properly");
	}
	
	
	
	
	
	
	@Test    (enabled=false)   //gate tap check
	public void postal()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aceenggacademy.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("POSTAL")).click();
		System.out.println("title of page is: " + driver.getTitle());
		
		driver.quit();
		
	System.out.println("POSTAL COACHING link working properly");
	}
}
