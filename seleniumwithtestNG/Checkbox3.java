package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Checkbox3
{
@Test
	public void Checkbox()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement checkbox =driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed= checkbox.isDisplayed();
		System.out.println("actualdispalyed :"+actualdispalyed);
		Assert.assertEquals(excepteddisplyed,actualdispalyed);

		boolean actualEnabled =true;
		boolean exceptedEnabled = checkbox.isEnabled();
		System.out.println("actualdispalyed :"+actualEnabled);
		Assert.assertEquals( actualEnabled,exceptedEnabled);

		boolean actualselected = true;
		boolean exceptedselected  = checkbox.isSelected ();
		System.out.println("actual selected  :"+actualselected );
		Assert.assertEquals(actualselected,exceptedselected); 
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		checkbox.click();

		boolean actualafterselected = false;
		boolean exceptedafterselected  = checkbox.isSelected ();
		System.out.println("actual selected :"+actualafterselected );
		Assert.assertEquals(actualafterselected, exceptedafterselected);
 
	}
}

	
	


