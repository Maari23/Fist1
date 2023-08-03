package Sd;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pageo.Login;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TakesScreenshot;

public class Steps {
	
	
	@After()
	public void tear_down(Scenario scenario )
	{

		String stri=scenario.getName().replace(" ","_");
		
		if(scenario.isFailed())
		{
		  byte[]  ss=	((TakesScreenshot)d).getScreenshotAs(OutputType.BYTES);
		  scenario.attach(ss, "image/png", stri);
		}
		
		
		d.close();
	
	}

	public WebDriver d;
	public  Login lp;
	
//	public  String url ="https://admin-demo.nopcommerce.com/admin/" ;
//	public  String em = "admin@yourstore.com";
//	public  String pw = "admin";

@Given("user iniate browser")
public void user_iniate_browser() {
	String path = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
  //  System.out.println(path);
	
	 ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.addArguments("--remote-allow-origins=*"); 
	 WebDriver d = new ChromeDriver(chromeOptions);  
	 this.d=d;
	 
	 Login lp= new Login(d);
	 this.lp=lp;
	 System.out.println(d);
	// System.out.println("12bc");
	// d.get("https://www.youtube.com/");
}

@When("user on page {string}")
public void user_on_page(String url) {
	System.out.println("abc");
	d.get(url);
	d.manage().window().maximize();
  //  d.get("https://admin-demo.nopcommerce.com/admin/");
}

@When("user enter and ")
public void user_enter_and() {
    
}

@When("user enter {string}  and  {string}")
public void user_enter_and(String un, String up) throws InterruptedException {
	lp.setue(un);
    lp.setup(up);
}

@And("clcik login")
public void clcik_login() throws InterruptedException 
{
	lp.setli();
	Thread.sleep(2000);
}

@Then("titel page  is")
public void titel_page_is() throws InterruptedException {
    
    System.out.println(d.getTitle());
    Thread.sleep(2000);
}

@When("user click logout")
public void user_click_logout() throws InterruptedException {
 lp.setlo();
 Thread.sleep(2000);
}

@Then("title sould be")
public void title_sould_be() throws InterruptedException {
	
    System.out.println(d.getTitle());
    Thread.sleep(2000);

    
}

@And("close browser")
public void close_browser() throws InterruptedException {
	Thread.sleep(3000);
	
    
}
}
