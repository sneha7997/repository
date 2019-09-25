package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpom {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 pageclass pobject=new pageclass(driver);
	 driver.get("http://demowebshop.tricentis.com/login");
	 driver.manage().window().maximize();
	 pobject.clicklink();
	 pobject.typeuname();
	 pobject.typepass();
	 pobject.clickonlogin();
	 pobject.logout();
	 System.out.println("title "+driver.getTitle());
}
}