package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver driver=null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user enters jiuiocnioc as username$")
	public void user_enters_jiuiocnioc_as_username() {
		driver.findElement(By.name("userName")).sendKeys("jiuiocnioc");
	
	}

	@When("^user enters cemndi(\\d+) as password$")
	public void user_enters_cemndi_as_password(int arg1)  {
		driver.findElement(By.id("password")).sendKeys("cemndi897");
	
	}

	@Then("^user will  Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() throws InterruptedException  {
		driver.findElement(By.name("Login")).click();
		System.out.println("title of the page is"+driver.getTitle());
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"bag").perform();
		Thread.sleep(3000);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				
	  
	}


}
