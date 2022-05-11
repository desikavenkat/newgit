package orangesample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desika\\eclipse-workspace\\selenium1\\lib\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://desika-trials7401.orangehrmlive.com/auth/login");
		driver.manage().window().minimize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement pswd= driver.findElement(By.id("txtPassword"));
		pswd.sendKeys("B1sXoVC@8p");
		WebElement login =driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button"));
		login.click();
		
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]/span[2]")).click();
	}

}
