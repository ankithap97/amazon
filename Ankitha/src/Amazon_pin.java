import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 // TC1 Open url
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	      //TC2 Verify if after clicking the electronics feature user lands in electronics page
	        driver.findElement(By.partialLinkText("Electronics")).click();
	        Thread.sleep(5000);
	       //Tc3 Verify  if user is able to navigate back to amazon home page
	        driver.navigate().back();
         //TC3 quit the browser
	        driver.quit();
	}

}
