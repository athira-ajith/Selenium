package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckBox extends Base{
	
	public void multipleCheckBox() {
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement Chkbox=driver.findElement(By.xpath("//label[@for='check-box-one']"));
		Chkbox.click();
		WebElement Chkbox1=driver.findElement(By.xpath("//label[@for='check-box-two']"));
		Chkbox1.click();
		WebElement Chkbox2=driver.findElement(By.xpath("//label[@for='check-box-three']"));
		Chkbox2.click();
		WebElement Chkbox3=driver.findElement(By.xpath("//label[@for='check-box-four']"));
		Chkbox3.click();
		WebElement Button=driver.findElement(By.xpath("//input[@value='Unselect All']"));
		Button.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCheckBox d1 = new MultipleCheckBox();
		d1.launchBrowser();
		d1.multipleCheckBox();
	}

}
