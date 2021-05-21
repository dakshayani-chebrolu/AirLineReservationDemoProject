package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderSummaryPage {

	WebDriver driver;

	public OrderSummaryPage(WebDriver driver) {
		this.driver=driver;
	}

	By bookingId = By.xpath("//td[text()='Id']/following-sibling::td[1]");
	By thankMessage=By.xpath("//h1[text()='Thank you for your purchase today!']");



	public String getOrderId() {
		String id=driver.findElement(bookingId).getText();
		return id;

	}




}
