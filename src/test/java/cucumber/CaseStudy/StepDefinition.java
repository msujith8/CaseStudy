package cucumber.CaseStudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {
	WebDriver driver;
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		  System.setProperty("webdriver.chrome.driver", "src\\test\\resorces\\java\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	Assert.assertEquals("Home", driver.getTitle());
	driver.findElement(By.linkText("SignIn")).click();
	
	}

	@When("user enters valid credintials")
	public void user_enters_valid_credintials() {
	}

	@When("clicks the search tab & enters the first {int} characters")
	public void clicks_the_search_tab_enters_the_first_characters(Integer int1) {
	}

	@When("select product from the dropdown list")
	public void select_product_from_the_dropdown_list() {
	}

	@When("click on find details")
	public void click_on_find_details() {
	}

	@When("add the product")
	public void add_the_product() {
	}

	@Then("check oout page")
	public void check_oout_page() {
	}


}
