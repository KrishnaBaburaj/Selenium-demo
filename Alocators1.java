package introduction2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alocators1 {

	public static void main(String[] args) {
    WebDriver driver  = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
