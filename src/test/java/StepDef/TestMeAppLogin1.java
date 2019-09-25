package StepDef;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppLogin1 {

	WebDriver driver=null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.manage().window().maximize();
	 driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");  
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Password123"); 
	}

	@Then("user Finds a testmeApp homepage")
	public void user_Finds_a_testmeApp_homepage() {
		driver.findElement(By.name("Login")).click();
		System.out.println("title "+driver.getTitle());
	}
}
