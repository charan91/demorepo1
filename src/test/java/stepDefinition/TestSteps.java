package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	WebDriver driver1;

	@Given("^User is on Login page$")

	public void User_is_on_Login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"E:\\softwares\\chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(5);
		driver1.manage().window().maximize();
		Thread.sleep(5);
	}

	// @When(“^User enters\”([^\”]*)\”and\”([^\”]*)\”$”)
	//
	// public void User_Enters_Username_and_Password(String username, String
	// password) throws Throwable {
	//
	// }

	@When("^User Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_Enters_and(String arg1, String arg2) throws Throwable {
		driver1.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
		driver1.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg2);

	}

	@Then("^Message Displays Login Successfully$")
	public void Message_Displays_Login_Successfully() throws Throwable {
		driver1.findElement(By.xpath("//input[@type='submit']")).click();

		// Print a Log In message to the screen
		System.out.println("Login Successfully");

	}

	// @When("^User LogOut from the Application$")
	// public void User_LogOut_from_the_Application() throws Throwable {
	// // WebDriverWait wait = new WebDriverWait(driver1, 30);
	// Thread.sleep(5);
	// //
	// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("userNavigationLabel")));
	// driver1.findElement(By.id("userNavigationLabel")).click();
	// driver1.findElement(By.id("u_b_5")).click();
	//
	// }
	//
	// @Then("^Message displayed LogOut Successfully$")
	// public void Message_displayed_LogOut_Successfully() throws Throwable {
	//
	// System.out.println("LogOut Successfully");
	// // driver1.quit();
	// }

}
