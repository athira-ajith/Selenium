package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void getfullTablevalue() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.id("dtBasicExample"));
		System.out.println(table.getText());
	}
	
	public void toSelectarow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(table1.getText());		
	}
	public void toSelectanelement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[3]"));
		System.out.println(table2.getText());		
	}
	public void toSelectlistelements() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table3=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement tb:table3) {
		System.out.println(tb.getText());	}	
	}
	public void searchforanElement() {
		String input="Senior Javascript Developer";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table4=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement tb2:table4) {
			if(tb2.getText().equals(input)) {
				System.out.println(tb2.getText());
				
			}
		}
			
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling th= new TableHandling();
		th.launchBrowser();
		System.out.println("\n*****************");
		th.getfullTablevalue();
		System.out.println("\n*****************");
		th.toSelectarow();
		System.out.println("\n*****************");
		th.toSelectanelement();
		System.out.println("\n*****************");
		th.toSelectlistelements();
		System.out.println("\n*****************");
		th.searchforanElement();
		

	}

}
