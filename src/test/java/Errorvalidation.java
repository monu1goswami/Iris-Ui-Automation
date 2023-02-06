
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errorvalidation {

	public static void main(String[] args) {
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Open url on the Browser
		driver.get("https://osa-web.t-cg.co.uk/");
		driver.manage().window().maximize();
		
		//Search for B16 8PE in search box
		driver.findElement(By.id("main")).sendKeys("B16 8PE");
			
		//click on Search Icon
		driver.findElement(By.id("searchPostcodeButton")).click();
		
		
		//scroll to the element Contact group
		WebElement flag = driver.findElement(By.className("text-irisBlue"));
		js.executeAsyncScript("arguments[0].scrollIntoView();", flag);
		
		//driver.quit();
		
		
		
		
	}

}
