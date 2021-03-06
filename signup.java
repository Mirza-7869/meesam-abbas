package mobiles;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class signup {

@Test(dataProvider="getData")
public void login(String EmailId, String Password) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.get("https://mobileworld.azurewebsites.net/");
Assert.assertEquals(driver.getTitle(), "Mobile");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Assert.assertEquals(driver.getTitle(), "Login");
Assert.assertEquals("https://mobileworld.azurewebsites.net/sign.html",driver.getCurrentUrl());
driver.findElement(By.id("username")).sendKeys(EmailId);
driver.findElement(By.name("password")).sendKeys(Password);
driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
driver.findElement(By.xpath("//a[text()='Log In']")).click();
Thread.sleep(2000);
Assert.assertEquals("https://mobileworld.azurewebsites.net/index.html", driver.getCurrentUrl());
driver.quit();
}



@DataProvider
public Object[][] getData()
{
Object[][] data = new Object[5][2];
data[0][0]="meesam.414@gmail.com ";
data[0][1]="zzzzz";
data[1][0]="mirza@gmail.com ";
data[1][1]="wwwwwwwww";
data[2][0]="abbas123@gmail.com ";
data[2][1]="xxxxx";
data[3][0]="meesam@12gmail.com ";
data[3][1]="yyyyyyyy";
data[4][0]="mirzameesamabbas@gmail.com ";
data[4][1]="rfghi";



return data;



}
}


