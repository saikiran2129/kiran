package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Radiobutton1 
{
@Test
 public void Radiobutton1()	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement  Radiobutton =driver.findElement(By.xpath("//input[@type='radio' and @value='oneway']"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed=  Radiobutton.isDisplayed();
		System.out.println("actualdispalyed : "+actualdispalyed);
		Assert.assertEquals(excepteddisplyed,actualdispalyed);

		boolean actualEnabled =true;
		boolean exceptedEnabled =  Radiobutton.isEnabled();
		System.out.println("actualdispalyed : "+actualEnabled);
		Assert.assertEquals( actualEnabled,exceptedEnabled);

 		boolean actualselected = true;
		boolean exceptedselected  =  Radiobutton.isSelected ();
		System.out.println("actual selected  : "+actualselected );
		Assert.assertEquals( actualselected,exceptedselected);
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();

		Radiobutton.click();

		boolean actualafterselected = false;
		boolean exceptedafterselected  = Radiobutton.isSelected ();
		System.out.println("actual selected : "+actualafterselected );
		Assert.assertEquals(actualafterselected, actualafterselected);

	}

}




 
	




 	


