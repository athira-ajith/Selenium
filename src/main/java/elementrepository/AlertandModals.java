package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertandModals extends Base{
	
	public void AlertModals() {
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		//WebElement Alert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		//Alert.click();
		//driver.switchTo().alert().accept();
		//WebElement Alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		//Alert2.click();
		//driver.switchTo().alert().dismiss();
		WebElement Alert2=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Alert2.click();
		driver.switchTo().alert().sendKeys("Athira");
		driver.switchTo().alert().accept();
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertandModals d1=new AlertandModals();
		d1.launchBrowser();
		d1.AlertModals();

	}

}
