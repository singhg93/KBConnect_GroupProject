package test.com.kbconnect.boundary;
/**
 * Selenium test for management of alert by admin
 */
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AlertAddSeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "c:/temp/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void alertAddTest() {
    driver.get("http://localhost:8080/KBPayment_GroupProject/adminLogin.jsp");
    driver.manage().window().setSize(new Dimension(1216, 678));
    driver.findElement(By.name("username")).click();
	driver.findElement(By.name("username")).sendKeys("william");
	driver.findElement(By.name("password")).sendKeys("williamshi301974");
	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
 
    driver.findElement(By.linkText("Alerts")).click();
    driver.findElement(By.linkText("List all Alerts")).click();
//    driver.findElement(By.cssSelector("tr:nth-child(3) .btn")).click();
    driver.findElement(By.linkText("william")).click();
    driver.findElement(By.linkText("Alerts")).click();
    driver.findElement(By.linkText("Send out a new Alert")).click();
    driver.findElement(By.id("short-description")).click();
    driver.findElement(By.id("short-description")).sendKeys("Testing from home computer");
    driver.findElement(By.id("short-description")).click();
    driver.findElement(By.id("short-description")).sendKeys("Testing from home computer 3/30");
    driver.findElement(By.id("detail")).click();
    driver.findElement(By.id("detail")).sendKeys("testing for selenium");
    driver.findElement(By.name("routeId")).click();
    {
      WebElement dropdown = driver.findElement(By.name("routeId"));
 
    }
    driver.findElement(By.name("routeId")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(6)")).click();
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)")).getText(), CoreMatchers.containsString("Testing from home computer 3/30"));
    driver.close();
  }
}
