package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
WebDriver driver;
By lnc=By.linkText("Log in");
By uname=By.name("Email");
By pwd=By.name("Password");
By lin=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
By lout=By.linkText("Log out");
public pageclass(WebDriver driver) {
	this.driver=driver;
}
public void clicklink() {
	driver.findElement(lnc).click();
}
public void typeuname() {
	driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
}
public void typepass() {
	driver.findElement(pwd).sendKeys("aravind");
}
public void clickonlogin() {
	driver.findElement(lin).click();
}
public void logout() {
	driver.findElement(lout).click();
}
}
