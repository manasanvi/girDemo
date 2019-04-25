package HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public static WebDriver driver;
	public static Properties prop;

	private static Logger log = LogManager.getLogger(base.class.getName());

	public WebDriver getBrowser(String browser) throws IOException {

		log.info("Choosing browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriver\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Got browser");
		return driver;
	}

	public WebDriver Login() throws IOException, InterruptedException {

		log.info("Opening website");
		prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\manas\\ZucaWeb\\src\\main\\java\\HomePage\\preTest.properties");
		prop.load(fs);
		driver = getBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		return driver;
	}

//	public void goToHomePage() {
//		
//			driver.switchTo().alert().dismiss(); // driver.switchTo.alert()
//		

		/*
		 * public void getScreenshot(String result) throws IOException { File src =
		 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src, new
		 * File("C:\\Users\\manas\\Screenshots\\ZucaWeb\\"+result+"screenshot.png"));
		 * 
		 * }
		 */
	
}