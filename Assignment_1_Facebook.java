package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jayaa");
		driver.findElement(By.name("lastname")).sendKeys("Murugan");
		driver.findElement(By.name("reg_email__")).sendKeys("15846358");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123");
		WebElement Dateofbirth=driver.findElement(By.id("day"));
		Select sc=new Select(Dateofbirth);
		sc.selectByValue("18");
		WebElement name=driver.findElement(By.id("month"));
		Select na=new Select(name);
		na.selectByVisibleText("Oct");
		WebElement yr=driver.findElement(By.id("year"));
		Select yer=new Select(yr);
		yer.selectByVisibleText("1997");
		driver.findElement(By.className("_8esa")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		

	}

}
