package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base{
	
	public void dragDrop() {
		driver.get("https://selenium.qabible.in/drag-drop.php");
		WebElement draggable1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(draggable1).click();
		actions.doubleClick(draggable1).perform();
		WebElement destintion=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(draggable1, destintion).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop d2=new DragandDrop();
		d2.launchBrowser();
		d2.dragDrop();

	}

}
