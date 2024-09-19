package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elementrepository.Base;

public class DropDown extends Base{
public void dropDownLoc() {
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropDown = driver.findElement(By.id("dropdowm-menu-1"));
	Select select = new Select(dropDown);
	// select.selectByVisibleText("Python");//selects by text
	// select.selectByValue("python");//slects by value attribute
	select.selectByIndex(2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDown dl=new DropDown();
dl.launchBrowser();
dl.dropDownLoc();
	}

}
		
