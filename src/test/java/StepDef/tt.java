package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tt {
	WebDriver driver=null;
	@Given("user will open the application")
	public void user_will_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.manage().window().maximize();
	}

	@Given("user click on signin link")
	public void user_click_on_signin_link() {
		driver.findElement(By.linkText("SignIn")).click();   
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2); 
	    driver.findElement(By.name("Login")).click();
	}

	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() {
	    System.out.println("login successfully");
	}

}
