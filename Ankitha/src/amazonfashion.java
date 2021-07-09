import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonfashion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 //open url
		 driver.get("https://www.amazon.in/");
		 //Verify fashion functionality
		 driver.findElement(By.partialLinkText("Fashion")).click();
		 Thread.sleep(5000);
		 //Search for sportswear in fashion page
		 driver.findElement(By.partialLinkText("Sportswear")).click();
		 //Check if we are able to navigate back to fashionpage and not other page
		 driver.navigate().back();
		 //close the browser
		 driver.quit();
		 
		 
		 

	}

}
