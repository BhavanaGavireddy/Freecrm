package freecrm;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.CongmentoCrm;

public class Freecrm_test  extends Baseclass{
	@Test
	
	public void test() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 act = new Actions(driver);
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CongmentoCrm.Login();
		
		CongmentoCrm.contacts();
		CongmentoCrm.New();
		CongmentoCrm.Details();
		
	}

}
