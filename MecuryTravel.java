package att;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromeDriver","C:\\Users\\student\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		WebElement customerLogin=driver.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]"));
		customerLogin.click();
		Thread.sleep(200);
		WebElement register=driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
		register.click();
		Thread.sleep(200);
		WebElement firstName=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[1]/input"));
		firstName.sendKeys("Harshith");
		Thread.sleep(200);
		WebElement lastName=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/input"));
		lastName.sendKeys("Chintakindi");
		Thread.sleep(200);
		WebElement emailid=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[1]"));
		emailid.sendKeys("chintakindibhargav2016@gamil.com");
		Thread.sleep(200);
		WebElement setpassword=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[2]"));
		setpassword.sendKeys("Idontknow@18");
		Thread.sleep(200);
		WebElement confirmpassword=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[3]"));
		confirmpassword.sendKeys("Idontknow@18");
		Thread.sleep(200);
		WebElement mobilenumber=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[4]"));
		mobilenumber.sendKeys("8019801084");
		Thread.sleep(200);
		WebElement registerBtn=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button"));
		registerBtn.click();
		Thread.sleep(100);
		driver.quit();
	}
}
