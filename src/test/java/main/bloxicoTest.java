
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.Helper;


public class bloxicoTest {
    private static WebDriver driver;
    private static Helper helper;
            
    
    public bloxicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
       driver.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void openBrowserTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
    }
    
    @Test
    public void navigateToGoogleTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
        
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        
        assertTrue("Bad URL redirection", expectedUrl.equals(actualUrl));
    }
    
    @Test
    public void enterAddresInInputFieldTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        helper = new Helper(driver);
        helper.enterAddress("Bloxico");
        
        
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        
        assertTrue("Bad URL redirection", expectedUrl.equals(actualUrl));
        
    }
    
    @Test
    public void clickOnGoogleSearchButtonTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        helper = new Helper(driver);
        helper.enterAddress("Bloxico");
        helper.googleSearchButton();
    }
    
    @Test
    public void addresVerificationTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        helper = new Helper(driver);
        helper.enterAddress("Bloxico");
        helper.googleSearchButton();
        
        String expectedAddress = "https://bloxico.com";
        String actualAddress = helper.addressVerification();
        
        assertTrue("Address doesn´t match", expectedAddress.equals(actualAddress));
    }
}
