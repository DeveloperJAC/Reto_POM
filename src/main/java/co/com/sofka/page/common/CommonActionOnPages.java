package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CommonActionOnPages {

    private WebDriver driver;


    public CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void submit(By locator) {
        driver.findElement(locator).submit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void select(By locator) {
        driver.findElement(locator).isSelected();
    }

    public void clickOn(By locator){
        driver.findElement(locator).click();
    }

    public void clickOn(WebElement webElement){
        webElement.click();
    }


    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchFrameException e) {
            return false;
        }
    }
    public void visit(String url){
        driver.get(url);
    }
}








