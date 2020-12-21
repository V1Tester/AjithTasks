package task_1_171220;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonIPhone extends commonToAll.LaunchingBrowser {
	@Test
	public void task1() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		sendkeys(driver, searchbox, 20, "I Phone x");
		WebElement click1 = driver.findElement(By.xpath(
				"//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]"));
		click(driver, click1, 20, null);

		WebElement rclick = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		click(driver, rclick, 10, null);

		Set<String> windowhandles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(windowhandles);

		driver.switchTo().window(tabs.get(1));


		String price = driver.findElement(By.id("priceblock_ourprice")).getText();

		System.out.println("the mobile cost" + "   " + price);

	}
}
