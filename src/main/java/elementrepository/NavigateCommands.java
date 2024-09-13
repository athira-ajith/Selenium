package elementrepository;

public class NavigateCommands extends Base{
	
	public void navigateComnds() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommands obj1 = new NavigateCommands();
		obj1.launchBrowser();
		obj1.navigateComnds();
		
		

	}

}
