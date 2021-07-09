import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class amazon {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.opera.driver", "D:\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver driver =new OperaDriver();
        driver.get("https://www.amazon.in/");
        String s=driver.getTitle();
        System.out.println(s);
        driver.quit();*/
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
        WebDriver driver =new InternetExplorerDriver();
        driver.get("https://www.amazon.in/");
        driver.quit();
        
	}

}
