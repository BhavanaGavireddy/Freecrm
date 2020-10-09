package objects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import freecrm.Baseclass;

public class CongmentoCrm  extends Baseclass{
	
	
	
	public static By Url=By.xpath("https://ui.freecrm.com/");
	public static By Email=By.xpath("//input[@placeholder='E-mail address']");
	public static By Password=By.xpath("//input[@placeholder='Password']");
	public static By login=By.xpath("//div[@class='ui fluid large blue submit button']");
	public static By Homepage= By.xpath("//div[contains(text(),'Contacts activity stream')]");
	public static By Create_contact= By.xpath("//*[contains(text(),'Create New Contact')]");
	public static By Email_address=By.xpath("//input[@placeholder='Email address']");
	
    public static By contact=By.xpath("//span[contains(text(),'Contacts')]");
    public static By  New=By.xpath("//button[contains(text(),'New')]");
    public static By Firstname=By.xpath("//input[@name='first_name']");
    public static By Lasname=By.xpath("//input[@name='last_name']");
    public static By company=By.xpath("//div[@name='company']//input[@class='search']");
    public static By Channel_dropdown=By.xpath("//div[@name='channel_type']//div[@role='option']");
    public static By Address=By.xpath("//div[@class='sixteen wide fields custom-address-container']");
    public static By Channel=By.xpath("//div[@name='channel_type']");
    public static By Timezone=By.xpath("//div[@name='timezone']//input[@class='search']");
    public static By Street_Address=By.xpath("//input[@placeholder='Street Address']");
    public static By City=By.xpath("//input[@placeholder='City']");
    public static By State_Country=By.xpath("//input[@placeholder='State / County']");
    public static By Zipcode=By.xpath("//input[@placeholder='Zip Code']");
    public static By Country=By.xpath("//div[contains(text(),'Country')]");
    public static By country_dropdown=By.xpath("//div[@name='country']//input[@class='search']");
    public static By Do_not_call=By.xpath("(//*[contains(text(),'Do not Cal')])[2]");
    public static By Day=By.xpath("//input[@name='day']");
    public static By month=By.xpath("//*[@name='month']");
    public static By year=By.xpath("//input[@name='year']");
    public static By month_dropdown=By.xpath("//div[@class='visible menu transition']//div[@role='option']");
    public static By Save=By.xpath("//*[@class='ui linkedin button']");
    public static By Delete=By.xpath("//*[@class='ui button icon']");
    public static By Confirm_Delete=By.xpath("//*[@class='ui red button']");
    public static By Settings=By.xpath("(//i[@class='settings icon'])[1]");
    public static By logout=By.xpath("//span[contains(text(),'Log Out')]");
    public static By view = By.xpath("(//*[@class='ui icon button'])[1]");
    public static By Birthday = By.xpath("//div[@class='three fields custom-address-container']");
    public static By Saved_checkbutton = By.xpath("//div[@class='ui fitted read-only checkbox']");
    
    	
	public static void Login() throws Throwable {
		
		String url =driver.getCurrentUrl();
		System.out.println( "URL :"  +url);
		Thread.sleep(5000);
		//Enter Email id & password ,then login
		driver.findElement(Email).sendKeys("bvnreddy452@gmail.com");
		driver.findElement(Password).sendKeys("Sairam@123");
		driver.findElement(login).click();
		Thread.sleep(7000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		if(driver.findElement(Homepage).isDisplayed())
		{
			System.out.println("In Homepage");
		}
		else{
			System.out.println("Not in Homepage ");
		}
		
		
	}

	public static void contacts() throws Throwable {
		Thread.sleep(5000);
		//In contacts page
		driver.findElement(contact).click();
		
		if(driver.findElement(New).isDisplayed())
		{
			System.out.println("In Contacts page");
		}
		else{
			System.out.println("Not in contacts page ");
		}
		Thread.sleep(5000);
	}

	public static void New() throws Throwable {
		Thread.sleep(5000);
		//selecting new 
		driver.findElement(New).click();
		Thread.sleep(5000);

		
		
	}

	public static void Details() throws Throwable {
		Thread.sleep(5000);
		//Entering Firstnamae & Lastname & company
		driver.findElement(Firstname).sendKeys("Sai");
		driver.findElement(Lasname).sendKeys("Ram");
		driver.findElement(company).sendKeys("UST-Global");
		if(driver.findElement(company).isEnabled())
		   {
			   System.out.println("Company is selected");
		   }
		   else{
			   System.out.println("Company is not  selected");
			   }
		
		Thread.sleep(5000);
	//selecting emailid
		driver.findElement(Email_address).sendKeys("bvnreddy452@gmail.com");
		if(driver.findElement(Email_address).isEnabled())
		   {
			   System.out.println("Email_address is selected");
		   }
		   else{
			   System.out.println("Email_address is not  selected");
			   }
		Thread.sleep(5000);
		driver.findElement(Channel).click();
		Thread.sleep(5000);
		//selecting facebook from droplist
		List<WebElement> channel_dropdownlist = driver.findElements(Channel_dropdown);
		for( int j = 0; j< channel_dropdownlist.size();j++){
		   // if the option is By Subject click that option
		   if( channel_dropdownlist.get(j).getText().equals("Facebook")){
			   channel_dropdownlist.get(j).click();
			   System.out.println("Facebook is selected");
				
		      break;
				}
		  
		   Thread.sleep(5000);
	}
		//seleting timezone
		driver.findElement(Timezone).click();
		   driver.findElement(Timezone).sendKeys("Indian");
		   act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();	
		   
		   if(driver.findElement(Timezone).isEnabled())
		   {
			   System.out.println("Timezone is selected");
		   }
		   else{
			   System.out.println("Timezone is not  selected");
			   }
			
		   
		   Thread.sleep(5000);
		   //entering addreess
		   driver.findElement(Street_Address).sendKeys("hitechcity");
		   Thread.sleep(3000);
		   driver.findElement(City).sendKeys("Hyderabad");
		   Thread.sleep(3000);
		   driver.findElement(State_Country).sendKeys("Telanaga");
		   Thread.sleep(3000);
		   driver.findElement(Zipcode).sendKeys("500061");
		   Thread.sleep(3000);
		   
		   driver.findElement(Country).click();
		   Thread.sleep(3000);
			driver.findElement(country_dropdown).sendKeys("ind");
			act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();	
			
			Thread.sleep(3000);
			if(driver.findElement(Address).isEnabled())
			   {
				   System.out.println("Adress is selected");
			   }
			   else{
				   System.out.println("Address is not  selected");
				   }
			
			
			Thread.sleep(5000);
			//selecting Do_not_call
		   driver.findElement(Do_not_call).click();
		   if(driver.findElement(Do_not_call).isDisplayed())
		   {
			   System.out.println("Do_not_call is selected");
		   }
		   else{
			   System.out.println("Do_not_call is not  selected");
			   }
		   //enetering birthday
		  driver.findElement(Day).sendKeys("08");
		 
		  WebElement	dropdown =driver.findElement(month);
			
		  dropdown.click();
		  		
		  List<WebElement> opt = driver.findElements(month_dropdown);
				  int s = opt.size();
		  // Iterating through the list selecting the desired option
		  for( int j = 0; j< opt.size();j++){
		     // if the option is By Subject click that option
		     if( opt.get(j).getText().equals("May")){
		        opt.get(j).click();
		        break;
		  		
		  		
		  	}
		     
		     Thread.sleep(5000);
		     
		  } 
		  
		  driver.findElement(year).sendKeys("1996");
		  Thread.sleep(7000);
		  
		  if(driver.findElement(Birthday).isEnabled())
		   {
			   System.out.println("Birthday is selected");
		   }
		   else{
			   System.out.println("Birthday is not  selected");
			   }
		  
		  //saving the account
		  Thread.sleep(5000);
		  driver.findElement(Save).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(contact).click();
		  Thread.sleep(5000);
		  
		  List<WebElement> checkBoxes = driver.findElements(Saved_checkbutton);
		  System.out.println("No.of Saved accounts:"  +checkBoxes.size());
		  Thread.sleep(6000);
		  driver.findElement(view).click();
		  
		  Thread.sleep(5000);
		  
		  
		  driver.findElement(Delete).click();
		  Thread.sleep(5000);
		  driver.findElement(Confirm_Delete).click();
		  
		  Thread.sleep(6000);
		  List<WebElement> checkBoxe = driver.findElements(Saved_checkbutton);
		  System.out.println("No.of Saved accounts after deleting:"  +checkBoxe.size());
		  Thread.sleep(5000);
		  driver.findElement(Settings).click();
		  Thread.sleep(5000);
		  driver.findElement(logout).click();
		  driver.quit();
		  
}}
