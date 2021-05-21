package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	By welcomeMessage = By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']");

	By departureCityHeading=By.xpath("//h2[text()='Choose your departure city:']");

	By destinationCityHeading=By.xpath("//h2[text()='Choose your destination city:']");

	By submitButton=By.xpath("//input[@type='submit' and @value='Find Flights']");

	By departureCityDropdown= By.name("fromPort");

	By destinationCityDropdown= By.name("toPort");


	public FlightsSearchResultPage clickFindFlightsButton() {
		driver.findElement(submitButton).click();
		return new FlightsSearchResultPage(driver);

	}

	public void selectDepartureCity(String departureCity) {
		Select fromPortDropdown = new Select(driver.findElement(departureCityDropdown));
		fromPortDropdown.selectByValue(departureCity);
	}

	public void selectDestinationCity(String destinationCity) {
		Select toPortDropdown = new Select(driver.findElement(destinationCityDropdown));
		toPortDropdown.selectByValue(destinationCity);
	}


}
