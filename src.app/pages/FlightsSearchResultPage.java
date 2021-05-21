package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsSearchResultPage {

	WebDriver driver;

	public FlightsSearchResultPage(WebDriver driver) {
		this.driver=driver;
	}

	By chooseFlightOption = By.xpath("//td[text()='43']/following-sibling::td[text()='Virgin America']/preceding-sibling::td/input[@type='submit' and @value='Choose This Flight']");



	public EmployeeDetailsPage clickChooseFlightButton() {
		driver.findElement(chooseFlightOption).click();
		return new EmployeeDetailsPage(driver);

	}

	
}
