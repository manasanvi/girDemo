package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	 WebDriver driver;

	public HomePageObjects(WebDriver driver) {
	 		this.driver=driver;
	 		
	
	}
	
	By MyAccount=By.xpath("//a[@id='dropdownMenu1']");
	By UserName=By.id("USERNAME");
	By Password=By.id("PASSWORD");
	By LogIn=By.name("SignIn");   //By LogIn=By.xpath("//input[@name='SignIn']");
	By ForgotPassword=By.linkText("Forgot Your Password?");
	By navigatebar=By.id("myNavbar");
	
	
	
	public WebElement myaccount() {
		return driver.findElement(MyAccount);
	}

	public WebElement navigate() {
		return driver.findElement(navigatebar);
	}
	public WebElement forgotpassword() {
		return driver.findElement(ForgotPassword);
	}
	public WebElement username() {
		return driver.findElement(UserName);
	}
	
	public WebElement password() {
		return driver.findElement(Password);
	}
	
	public WebElement login() {
		return driver.findElement(LogIn);
	}
	
	
}
