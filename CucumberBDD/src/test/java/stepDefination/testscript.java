package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testscript
{
	public static WebDriver driver;
	@Given("when user open the browser and enter the test url")
	public void when_user_open_the_browser_and_enter_the_test_url() 
	{
	  WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	}

	@Then("login page should be displyed")
	public void login_page_should_be_displyed() 
	{
	   String tittle = driver.getTitle();
	   Assert.assertEquals(tittle,"Facebook – log in or sign up");
	}

	@When("valid credential entered")
	public void valid_credential_entered()
	{
	   driver.findElement(By.id("email")).sendKeys("ravi37976@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("@prr9620850624");
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException
	{
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed()
	{
	   String titke = driver.getTitle();
	   Assert.assertEquals(titke,"Facebook Home page");
	}

}
