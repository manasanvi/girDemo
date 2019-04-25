package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import HomePage.LoginPage;
import HomePage.base;
import HomePage.validateHomePage;


@RunWith(Cucumber.class)
public class stepDefinations extends base {


	 @Given("^User access Login Page$")
	    public void user_access_login_page() throws Throwable {

		 	driver=Login();
		 	
		 	
		 	
	 }

	    @When("^User logins with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_logins_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	LoginPage lp=new LoginPage(driver);
	    	lp.AsignIn(strArg1, strArg2);
	    }

	    

		@Then("^Home Page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
			
	    }

	    @And("^Welcome Message is displayed \"([^\"]*)\"$")
	    public void welcome_message_is_displayed_something(String strArg1) throws Throwable {
	    	validateHomePage valid=new validateHomePage(driver);
	    	valid.validatehome();
	    	
	    }
	    
	    @And("^close the driver$")
	    public void close_the_driver() throws Throwable {
	        driver.quit();
	    }

}