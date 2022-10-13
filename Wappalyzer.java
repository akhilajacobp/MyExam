package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wappalyzer
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
	}
	@Test
	public void operations()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-49\"]/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div[1]")).click();
		//WebElement search=driver.findElement(By.id("input-1070"));
	//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", search);
		Actions a=new Actions(driver);
		WebElement search=driver.findElement(By.id("//*[@id=\"list-626\"]/form/div/div/div/div[1]/input"));
		a.moveToElement(search);
		a.perform();
		search.click();
		//driver.manage().timeouts().implicitlyWait(0, null)
		//driver.findElement(By.xpath("//*[@id=\"list-439\"]/form/div/div/div/div[1]/input")).sendKeys("Shopify apps");
		//WebElement search=driver.findElement(By.id("input-1070"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", search);
		//Thread.sleep(800);
		//const element = document.getElementById("content");
		//element.scrollIntoView();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", search);
		//search.sendKeys("Shopify apps",Keys.ENTER);
	}
}
