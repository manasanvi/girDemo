package HomePage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepo.HomePageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class validateHomePage extends base {

	HomePageObjects hpo = new HomePageObjects(driver);;

	public validateHomePage(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		Login();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void validatehome() throws IOException, InterruptedException {

		Assert.assertTrue(hpo.navigate().isDisplayed());

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}