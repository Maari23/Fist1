package Pageo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver ld;
		

	public Login(WebDriver rd)
	{
		ld=rd;
		PageFactory.initElements(rd,this);
	}
	
	@FindBy(id="Email")
	WebElement te;
	
	@FindBy(id="Password")
	WebElement tp;
	
	@FindBy(xpath="/html//div[3]/button")
	WebElement bl;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement bo;
	
	public void setue(String un) 
	{
		te.clear();
		te.sendKeys(un);
	}
	
	public void setup(String up) 
	{
		tp.clear();
		tp.sendKeys(up);
	}
	
	public void setli() 
	{
		bl.click();
	}
	
	public void setlo() 
	{
		bo.click();
	}
	
	
}
