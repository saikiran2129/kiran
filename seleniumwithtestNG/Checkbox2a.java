package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Checkbox2a
{
	@Test
	public void Checkbox()

	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkbox2bforIsselect =driver.findElement(By.xpath("//input[@id='caddoptional']"));
		WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed= checkbox.isDisplayed();
		System.out.println("actualdispalyed : "+actualdispalyed);
		Assert.assertEquals(excepteddisplyed,actualdispalyed);

		boolean actualEnabled =true;
		boolean exceptedEnabled = checkbox.isEnabled();
		System.out.println("actualdispalyed : "+actualEnabled);
		Assert.assertEquals(actualEnabled,exceptedEnabled);

		boolean actualselected =true;
		boolean exceptedselected  = checkbox2bforIsselect.isSelected ();
		System.out.println("actual selected  : "+actualselected );
		Assert.assertEquals( actualselected,exceptedselected); 
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		checkbox.click();

		boolean actualafterselected =false;
		boolean exceptedafterselected  = checkbox.isSelected ();
		System.out.println("actual selected : "+actualafterselected );
		Assert.assertEquals(actualafterselected, exceptedafterselected);

	}
}





















