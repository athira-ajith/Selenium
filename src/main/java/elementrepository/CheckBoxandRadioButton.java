package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxandRadioButton extends Base {

	public void checkBox() {
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement Chkbox=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		Chkbox.click();
		WebElement checkButton=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		//checkButton.click();
		System.out.println(checkButton.isSelected());
	}
	public void radioButton() {
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement radio=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radio.click();
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButton.click();
		WebElement msgButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		msgButton.click();
		System.out.println(msgButton.isEnabled());
		System.out.println(msgButton.isDisplayed());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxandRadioButton c1=new CheckBoxandRadioButton();
		c1.launchBrowser();
		//c1.checkBox();
		c1.radioButton();
		}}
