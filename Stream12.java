package Stream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stream12 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.0.77:8000/explorer/");
		List<WebElement> elements=driver.findElements( By.xpath("//*[@id=\"resource_user\"]/div/h2/a"));
	}
}
