package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Checkbox2b
{
	
	@Test
	public void Checkbox()
 	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkbox2a =driver.findElement(By.xpath("//input[@id='caddoptional']"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed= checkbox2a.isDisplayed();
		System.out.println("actualdispalyed : "+actualdispalyed);
		Assert.assertEquals(excepteddisplyed,actualdispalyed);

		boolean actualEnabled =true;
		boolean exceptedEnabled = checkbox2a.isEnabled();
		System.out.println("actualdispalyed : "+actualEnabled);
		Assert.assertEquals(actualEnabled,exceptedEnabled );

 		boolean actualselected =false;
		boolean exceptedselected  = checkbox2a.isSelected ();
		System.out.println("actual selected  : "+actualselected );
		Assert.assertEquals(actualselected,exceptedselected); 
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		checkbox2a.click();

		boolean actualafterselected = false;
		boolean exceptedafterselected  = checkbox2a.isSelected ();
		System.out.println("actual selected : "+actualafterselected );
		Assert.assertEquals(actualafterselected, exceptedafterselected );

	}
}











	


 	





