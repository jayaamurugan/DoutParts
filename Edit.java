package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.manage().window().minimize();
		driver.findElement(By.id("email")).sendKeys("jay@gmail.com");
		driver.findElement(By.xpath("//input[@ value='Append']")).sendKeys("Testleaf");
		
		
	}

}
