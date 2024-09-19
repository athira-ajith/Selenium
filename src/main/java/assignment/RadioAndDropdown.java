package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elementrepository.Base;

public class RadioAndDropdown extends Base{
public void radioDropSelectedDisabled() {
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radio=driver.findElement(By.xpath("//input[@value='lettuce']"));
	radio.click();
	WebElement dropdown=driver.findElement(By.id("fruit-selects"));
	Select select=new Select(dropdown);
	select.selectByValue("pear");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RadioAndDropdown rd=new RadioAndDropdown();
rd.launchBrowser();
rd.radioDropSelectedDisabled();
	}

}