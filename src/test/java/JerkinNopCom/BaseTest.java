package JerkinNopCom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{
BrowserSelector browserSelector = new BrowserSelector();
    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser();
        //System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\Browser_Driver\\geckodriver.exe");
        //driver=new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
  @AfterMethod
    public void closeBrowser(){
       driver.quit();
    }
}
