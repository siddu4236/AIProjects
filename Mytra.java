package att;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions action=new Actions(driver);
		WebElement Login = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[1]/span[1]"));
		action.moveToElement(Login).perform();
		Thread.sleep(2000);
		WebElement registerBtn = driver.findElement(By.className("desktop-linkButton"));
		registerBtn.click();
		WebElement phone_number = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input"));
		phone_number.click();
		phone_number.sendKeys("8019801084");
		WebElement continueBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[3]"));
		continueBtn.click();
		
	}

}
