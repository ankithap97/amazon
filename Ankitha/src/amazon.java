import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 // TC1 Open url
	        driver.get("https://www.amazon.in/");
	     // TC2 maximize the windows
	        driver.manage().window().maximize();
	     // TC3 Verify The search functionality 
	        WebElement a=driver.findElement(By.id("twotabsearchtextbox"));
	        a.click();
	        a.sendKeys("Asus mobile");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	      //TC4 Navigate back to home page
	        driver.navigate().back();
	      //TC5 To print the title of amazon homepage
	      String s=  driver.getTitle();
	      System.out.println(s);
	      //TC6 close the browser
	       driver.quit();
	      
        	 
         }
	}


