package BitPanda.WebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {


    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();


    /**
     * Start and maximazing Chrome browser
     */
    public void sStartBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver\\chromedriver.exe");

        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

    }

    /**
     * Close Chrome browser
     */
    public void sStopBrowser() {
        driver.quit();
    }

    /**
     * Type value to input
     *
     * @param selector
     * @param value
     */
    public void sType(String selector, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
        driver.findElement(By.xpath(selector)).sendKeys(value);
    }


    /**
     * Click element
     *
     * @param selector
     */
    public void sClick(String selector) {
        driver.findElement(By.xpath(selector)).click();
    }

    /**
     * Wait for clickable element
     *
     * @param selector
     */
    public void sWait(String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));
    }

    /**
     * Select dropdown input
     *
     * @param selector
     */
    public void sSelect(String selector, String value) {
        Select dropdown = new Select(driver.findElement(By.xpath(selector)));
        dropdown.selectByVisibleText(value);
    }

    /**
     * Open specific URL
     *
     * @param url
     */
    public void sOpen(String url) {
        driver.get(url);
    }
}

