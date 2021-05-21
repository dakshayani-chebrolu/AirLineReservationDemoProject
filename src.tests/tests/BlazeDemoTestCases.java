package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import pages.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BlazeDemoTestCases {

	public WebDriver driver;
	String fromPort="Paris";
	String toPort="London";
	
	
	@BeforeTest
	public void initialize() 
	{
		String driverPath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		try{
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://blazedemo.com/");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void verifyFlightBookingInBlazeDemo()
	{

		try {
			HomePage homePage= new HomePage(driver);

			homePage.selectDepartureCity(fromPort);

			homePage.selectDestinationCity(toPort);

			FlightsSearchResultPage resultPage = homePage.clickFindFlightsButton(); 

			EmployeeDetailsPage employeeDetailsPage= resultPage.clickChooseFlightButton();

			employeeDetailsPage.enterName("Dakshayani");

			employeeDetailsPage.enterAddress("Finsensvej");

			employeeDetailsPage.enterCity("Frederiksberg");

			employeeDetailsPage.enterState("Copenhagen");

			employeeDetailsPage.enterZipCode("2000");

			employeeDetailsPage.selectCardType("visa");

			employeeDetailsPage.enterCreditCardNumber("1234 5678 9123 4567");

			employeeDetailsPage.enterCreditCardMonth("09");

			employeeDetailsPage.enterCreditCardYear("23");

			employeeDetailsPage.enterNameOncard("Dakshayani Chebrolu");

			OrderSummaryPage summaryPage=employeeDetailsPage.clickPurchaseFlightButton();

			String bookingId= summaryPage.getOrderId();

			System.out.println("Booking ID:"+bookingId);

			Assert.assertTrue(true);

		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}


	@AfterTest
	public void tearDown()
	{
		driver.close();

	}

}
