package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Buttonbox2 
{
@Test
 	public void Buttonbox()
 	{
 	WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		driver.switchTo().frame(0);
		WebElement submitButton=driver.findElement(By.xpath("(//input[@value='A submit button'])[2]"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed=submitButton.isDisplayed();
		System.out.println("actualdispalyed  - "+actualdispalyed);
		Assert.assertEquals( actualdispalyed, excepteddisplyed);		
		boolean actualdispalyed1 =true;
		boolean excepteddisplyed1 =submitButton.isDisplayed();
		System.out.println("actualdispalyed : "+actualdispalyed1);
		Assert.assertEquals(actualdispalyed1,excepteddisplyed1);		
		String actualsubmitbuttonname=submitButton.getAttribute("value");
		String exceptedsubmitbuttonname= "A submit button";
		System.out.println("actual buttonname:= "+actualsubmitbuttonname);
		Assert.assertEquals(actualsubmitbuttonname,exceptedsubmitbuttonname); 
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		submitButton.click();
	}
}




