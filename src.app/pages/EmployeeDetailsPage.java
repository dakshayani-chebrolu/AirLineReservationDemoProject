package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeDetailsPage {

	WebDriver driver;

	public EmployeeDetailsPage(WebDriver driver) {
		this.driver=driver;
	}

	By name = By.id("inputName");		
	By address  = By.id("address");
	By city=  By.id("city");
	By state=  By.id("state");
	By zipCode=  By.id("zipCode");
	By cardType=  By.id("cardType");
	By creditCardNumber=  By.id("creditCardNumber");
	By creditCardMonth=  By.id("creditCardMonth");
	By creditCardYear=  By.id("creditCardYear");
	By nameOnCard= By.id("nameOnCard");
	By purchaseFlightButton=By.xpath("//input[@type='submit' and @value='Purchase Flight']");

	public void enterName(String nameValue)
	{
		driver.findElement(name).sendKeys(nameValue);
	}

	public void enterAddress(String addressValue)
	{
		driver.findElement(address).sendKeys(addressValue);
	}

	public void enterCity(String cityValue)
	{
		driver.findElement(city).sendKeys(cityValue);
	}

	public void enterState(String stateValue)
	{
		driver.findElement(state).sendKeys(stateValue);
	}

	public void enterZipCode(String zipCodeValue)
	{
		driver.findElement(city).sendKeys(zipCodeValue);
	}

	public void selectCardType(String cardTypeValue)
	{

		Select cardTypeDropdown = new Select(driver.findElement(cardType));
		cardTypeDropdown.selectByValue(cardTypeValue);
	}

	public void enterCreditCardNumber(String cardNumber)
	{

		driver.findElement(creditCardNumber).sendKeys(cardNumber);
	}

	public void enterCreditCardMonth(String cardMonth)
	{

		driver.findElement(creditCardMonth).sendKeys(cardMonth);
	}
	public void enterCreditCardYear(String cardYear)
	{

		driver.findElement(creditCardYear).sendKeys(cardYear);
	}
	public void enterNameOncard(String nameOnCardValue)
	{

		driver.findElement(nameOnCard).sendKeys(nameOnCardValue);
	}

	public OrderSummaryPage clickPurchaseFlightButton() {
		driver.findElement(purchaseFlightButton).click();
		return new OrderSummaryPage(driver);

	}



}
