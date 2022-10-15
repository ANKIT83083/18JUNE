package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(2000);
		
		WebElement lan=driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s= new Select (lan);
		Thread.sleep(2000);
		
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		Thread.sleep(1000);
		s.selectByValue("python");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		//Thread.sleep(1000);
		//s.deselectByValue("js");
		//Thread.sleep(1000);
		//s.deselectByVisibleText("C#");
		//Thread.sleep(1000);
		//s.deselectAll();
		
		
		WebElement firstselected=s.getFirstSelectedOption();
		System.out.println(firstselected);
		System.out.println(firstselected.getText());
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());
		
		
		//List<WebElement> l=s.getOptions();
	   // System.out.println(l.size());
		//List<WebElement> l2=s.getAllSelectedOptions();
	   // System.out.println(l2.size());
	    
	  // for (int i=0; i<l.size();i++) {
	   //	System.out.println(l.get(i).getText());
	  // }
	    
	    
		
		
		
		
		
		
		
		
	}

}
