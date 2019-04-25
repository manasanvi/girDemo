package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepo.HomePageObjects;

public class LoginPage extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	public static HomePageObjects hpo = new HomePageObjects(driver);;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}


	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
		Login();
			
		
	}

	//@Test(dataProvider = "getData")
	public void AsignIn(String UN, String PW) throws IOException, InterruptedException {
		log.info("Sign In with UN and PW");
		hpo.myaccount().click();
		hpo.username().sendKeys(UN);
		hpo.password().sendKeys(PW);

		hpo.login().click();
		log.info("Sign In complete");
		
		}

	@Test
	public void zclickLinkText() throws IOException, InterruptedException {
		Login();
		
		hpo.myaccount().click();
		hpo.forgotpassword().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] =prop.getProperty("un");
		data[0][1] = prop.getProperty("pw");

		data[1][0] = prop.getProperty("un2");
		data[1][1] = prop.getProperty("pw2");

		return data;
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
