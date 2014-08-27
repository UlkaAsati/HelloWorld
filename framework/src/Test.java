import org.openqa.selenium.By;
import org.testng.Reporter;


public class Test extends Browser{

public void test(){
/* in this test we are searching selenium in Google and clicking on first link in Google Result*/

driver.get("http:\\www.google.com");


driver.findElement(By.id("gdqfq")).sendKeys("selenium");

//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();

}

driver.findElement(By.xpath("//old[@id='rso']/li[1]//h3/a")).click();


try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

}
