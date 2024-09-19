package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {
	
	public void inputFormClick() {
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> inputForm=driver.findElements(By.xpath("//input[@type='text']"));
	for(WebElement obj1:inputForm) {
		obj1.sendKeys("Hello");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements d1=new FindElements();
		d1.launchBrowser();
		d1.inputFormClick();
		

	}

}
