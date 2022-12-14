import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestWebDriver {

	@Test
void test() throws Exception {
		
		WebDriver driver = null;
		String browser = "Firefox";
		
		if(browser.equalsIgnoreCase("Edge")) {
		
			System.setProperty("webdriver.edge.driver", "D:\\YEAR 2 TERM 2\\T.Naruphon\\Work2\\Driver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "D:\\YEAR 2 TERM 2\\T.Naruphon\\Work2\\Driver\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		else if(browser.equalsIgnoreCase("Google")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\YEAR 2 TERM 2\\T.Naruphon\\Work2\\Driver\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
	    driver.get("https://www.google.com/");
	    driver.manage().window().setSize(new Dimension(974, 1032));
	    driver.findElement(By.name("q")).sendKeys("Npru");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    driver.close();
		
	}

}
