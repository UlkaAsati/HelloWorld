import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Browser {

WebDriver driver;
@BeforeMethod   /* The annotated method will be run before all tests in this suite have run */

//browser is the name of parameter that we have used in xml

@Parameters("browser") /* this annotation is used to insert parameter in test*/
public void openBroswer(String browser){

/*Comparing the value of parameter name if this is FF then It would launch Firefox and script that would run is as follows */

if(browser.equalsIgnoreCase("Firefox"))
	{
		System.out.println("Firefox will be used as a browser");
		WebDriver driver = new FirefoxDriver();
	}
	
if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome will be used as a browser");				
	}


if(browser.equalsIgnoreCase("IE will be used as a browser"))
	{
	 	System.setProperty("webdriver.ie.driver","D:\\library\\\\IEDriverServer.exe");
	 	WebDriver driver = new InternetExplorerDriver();
	 	System.out.println("IE will be used as a browser");
	}


}

@AfterMethod /* this annotation would run once test script execution would complete*/

public void closeBrowser()
	{try{
			driver.wait(15000);
		}
	catch(Exception e){}
		driver.close();
		driver.quit();
	}
}