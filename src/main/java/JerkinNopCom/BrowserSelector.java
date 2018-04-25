package JerkinNopCom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSelector extends Utils {
   public void selectBrowser(){
       String browser = "";
       browser = System.getProperty("browser");

       if(browser.equalsIgnoreCase("firefox")) {
           System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
           driver = new FirefoxDriver();
       }else if(browser.equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
           driver = new ChromeDriver();
       }else if(browser.equalsIgnoreCase("ie")) {
           System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
           DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
           capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
           driver = new InternetExplorerDriver(capabilities);
       }else {
           System.out.println("Wrong Browser" +browser);
       }
   }
}
