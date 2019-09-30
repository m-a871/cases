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

public class case4 {
	WebDriver driver=null;
	@Given("^Alex has logged it into test me app$")
	public void alex_has_logged_it_into_test_me_app()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("jiuiocnioc");
		driver.findElement(By.name("password")).sendKeys("cemndi897");
		driver.findElement(By.name("Login")).click();
		 // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}

	@When("^alex search a particular product$")
	public void alex_search_a_particular_product() throws InterruptedException  {
WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"moblie").perform();
		Thread.sleep(3000);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 
	}

	@When("^try to proceed to payment without adding any item in cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_in_cart()  {
		try
		{
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		}
		catch(Exception e)
		{
			System.out.println("cart is not present,so payment page is not displayed");
		}
	  
	}

	@Then("^test me app does not display the cart icon$")
	public void test_me_app_does_not_display_the_cart_icon()  {
		driver.close();
	   
	}



}
