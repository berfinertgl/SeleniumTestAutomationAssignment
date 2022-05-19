package methods;

import driver.MainTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Methods {

    WebDriver driver;

    FluentWait<WebDriver> wait;

    JavascriptExecutor jsdriver;

    public Methods() {

        driver = MainTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(38)).pollingEvery(Duration.ofMillis(300));

        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {

        return  wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> getProduct(By by) {
        List<WebElement> links = driver.findElements(by);
        return links;
    }

    //public void mouseHover

    public void click(By by) {

        findElement(by).click();
    }


    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by,String test) {
        findElement(by).sendKeys(test);
    }

    public boolean isElementVisible(By by){
        try{

            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;

        }catch (Exception e){
            return false;
        }
    }

    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollWithAction(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
    }

    public void scrollWithJs(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));
    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text){
        getSelect(by).selectByVisibleText(text);
    }

    public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getValue(By by){
        return jsdriver.executeScript("return arguments[0].value",findElement(by)).toString();
    }

    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform();
    }

    public List<WebElement> getProducts(By by) {
        List<WebElement> links = driver.findElements(by);
        return links;
    }

}


