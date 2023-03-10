package utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

		public static WebDriver initApplication(WebDriver driver,String browserName,String appUrl) throws InterruptedException {
			if (browserName.equalsIgnoreCase("Chrome")){
				
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
				driver=new EdgeDriver();
			}else if (browserName.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else {
				System.out.println("This driver is not supported at this moment");
			}
			Thread.sleep(10);
			
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;
			
		}
		
		public static  void exitBrowser(WebDriver driver) {
			driver.quit();
			
		}
		
		
}
