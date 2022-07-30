package LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {
	// Using Data provider Method
	
	String [][] data= {{"Admin","admin12"},
					   {"Aadim","admin123"},
					   {"adjij","shdajdb"},
					   {"Admin","adin123"}
	};
	
	@DataProvider(name="logindata")
	public String[][] logindata() {
		return data;
	}

	@Test(dataProvider = "logindata")
	public void test2(String username,String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys(username);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pass);

		WebElement clickbtn = driver.findElement(By.id("btnLogin"));
		clickbtn.click();
		driver.quit();

	}
}
