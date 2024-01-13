//Output Video: https://drive.google.com/file/d/1Xht6mSfFn9X_YNJXnlzWyvO1ZZK84vvX/view?usp=sharing
package Harshith;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class RedBus {
	public static void main(String[] args) throws InterruptedException, AWTException {
		HashMap<String, Object>prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",1);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver&quot","D:\\DeekshithATT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/online-tickets/bus-ticket-booking");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[4]/div[1]/div[1]/input"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement to=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[4]/div[2]/div/input"));
		to.sendKeys("Chennai");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement date=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[4]/div[3]/input"));
		date.click();
		Thread.sleep(2000);
		WebElement calender=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[4]/div[3]/div/div/div[1]/div[2]/div[2]/ul[2]/li[28]/span"));
		calender.click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"DC120_sw_main\"]/button"));
		search.click();
		Thread.sleep(2000);
		WebElement viewseats=driver.findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/ul/div[1]/li/div/div[2]/div[1]"));
		viewseats.click();
		Thread.sleep(2000);
		WebElement seatselect=driver.findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div/ul/div[1]/li/div[2]/div[2]/div[1]/div/div/div/div[3]/div[3]/div[3]/canvas"));
		seatselect.click();
		Thread.sleep(2000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span ,"));
		pop.click();
	}
}
