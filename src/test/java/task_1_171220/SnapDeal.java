package task_1_171220;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SnapDeal extends commonToAll.LaunchingBrowser {

	@Test
	public void task2() throws InterruptedException {
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphones 7");

		WebElement togo = driver.findElement(By.xpath("//span[text()='iphone 7 pro mobile phone']"));
		// Actions moveover=new Actions(driver);
		// moveover.moveToElement(togo);
		click(driver, togo, 20000, null);

		WebElement click0 = driver
				.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]"));
		click(driver, click0, 10000, null);

		WebElement click1 = driver
				.findElement(By.xpath("//p[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Blue']"));
		click(driver, click1, 10000, null);

		Set<String> windowhandles = driver.getWindowHandles();
		ArrayList<String> tab = new ArrayList<String>(windowhandles);
		driver.switchTo().window(tab.get(1));

		WebElement click2 = driver.findElement(By.xpath("//span[contains(text(),'add to cart')]"));
		click(driver, click2, 10000, null);

		String price = driver.findElement(By.xpath(
				"//body/div[@id='content_wrapper']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]"))
				.getText();
		System.out.println("Cost you have to pay is" + "   " + price);

	}

}
