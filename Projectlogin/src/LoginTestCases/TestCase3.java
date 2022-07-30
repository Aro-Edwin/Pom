package LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {

	// wrong username
	// wrong password
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("kavi");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("adm123");

		WebElement clickbtn = driver.findElement(By.id("btnLogin"));
		clickbtn.click();
		driver.quit();

	}
}