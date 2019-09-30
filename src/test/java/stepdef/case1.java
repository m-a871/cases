package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver=null;
	@Given("^user opens the application$")
	public void user_opens_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	  
	}

	@When("^user clicks on sign up link$")
	public void user_clicks_on_sign_up_link() throws Throwable {
		driver.findElement(By.linkText("SignUp")).click();
	
	}

	@When("^user enters details$")
	public void user_enters_details() throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("jiuiocnioc");
		driver.findElement(By.id("firstName")).sendKeys("mayank");
		driver.findElement(By.id("lastName")).sendKeys("anand");
		driver.findElement(By.id("password")).sendKeys("cemndi897");
		driver.findElement(By.id("pass_confirmation")).sendKeys("cemndi897");
		WebElement radio2=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label"));
		radio2.click();
		driver.findElement(By.id("emailAddress")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("7066265428");
		driver.findElement(By.name("dob")).sendKeys("12/12/1997");
		driver.findElement(By.id("address")).sendKeys("bangalore");
		Select pc=new Select(driver.findElement(By.name("securityQuestion")));
		pc.selectByIndex(1);
		driver.findElement(By.id("answer")).sendKeys("black");
		driver.findElement(By.name("Submit")).click();
		
		
		
	
	}

	@Then("^user is redirected to home page$")
	public void user_is_redirected_to_home_page() throws Throwable {
	 
	}

}
