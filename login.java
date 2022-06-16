package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	


	WebDriver driver;
@Test
	public void Lanching_the_Browser() {
	System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net");
	driver.manage().window().maximize();
	}}


