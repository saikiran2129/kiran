package seleniumwithtestNG;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionprogram {

	public static void main(String[] args) 
	{
 		 WebDriver driver=new ChromeDriver();
		  driver.get ("https://demo.guru99.com/test/newtours/");
		 WebElement username =driver.findElement(By.xpath("//input[@name='userName']"));
		 WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		 WebElement submit =driver.findElement(By.xpath("//input[@name='submit']"));
		 List<WebElement>List=new ArrayList<WebElement>();
		 List.add(username);
		 List.add(password);
		 List.add( submit);
		  
	      List.get(0).sendKeys( "RBG technologies");
		 List.get(0).sendKeys( " saikiran");
		 List.get(0). click();
}
}