
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Helper {
    private WebDriver driver;
    private static WebDriverWait wait;
    private By inputFieldLocator = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    private By googleSearchButtonLocator = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]");
    private By addresLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/div/cite");

    
    
    
    public Helper(WebDriver driver) {
        this.driver = driver;
    }
    
   
    public void enterAddress(String address) {
        driver.findElement(inputFieldLocator).sendKeys(address);
    }
    
    public void googleSearchButton() {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(googleSearchButtonLocator)).click();
    }
    
    public String addressVerification() {
        return driver.findElement(addresLocator).getText();
    }
    
}
