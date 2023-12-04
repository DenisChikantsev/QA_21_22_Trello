package start_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class selectorXpath {
    WebDriver driver;

    @BeforeClass
    public void preCondition() {
        driver = new ChromeDriver();

    }

    @Test
    public void start() {
        System.out.println("test");
        driver.get("https://trello.com/home");
        WebElement elementLogin = driver.findElement(By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
        System.out.println(elementLogin.getLocation().toString());
        WebElement btnGetTrelloForFree = driver.findElement(By.xpath("//*[text()='Get Trello for free' and @data-uuid=\"MJFtCCgVhXrVl7v9HA7EH_signup\"]"));
        System.out.println(btnGetTrelloForFree.getAttribute("Class"));
        WebElement trello = driver.findElement(By.xpath("//main[@id='skip-target']/section[@class=\"UiSectionstyles__Section-sc-4xxafg-0 cDvxpF ui-section\"]//h1"));
        System.out.println(trello.getText());
        WebElement section = driver.findElement(By.xpath("//main[@id='skip-target']/*[5]"));
        System.out.println(section.getAttribute("data-testid"));
        //main[@id='skip-target']//div[@class="UiTextBlock__TextBlock-sc-18qp69o-0 emERQn"]
        //main[@id='skip-target']//div[contains(@class, 'ScrollBar-sc-16')]
        WebElement divContains = driver.findElement(By.xpath("//main[@id='skip-target']//div[contains(@class, 'ScrollBar-sc-16')]"));
        System.out.println(divContains.getAttribute("class"));
        WebElement parent = driver.findElement(By.xpath("//main[@id='skip-target']//div[contains(@class, 'ScrollBar-sc-16')]/../../.."));
        System.out.println(parent.getAttribute("id"));
        List<WebElement> webElementList = driver.findElements(By.xpath("//*[@id='skip-target']/section"));
        for (WebElement e : webElementList){
            System.out.println(e.getAttribute("class"));
        }
    }

    @Test
    public void start1() {
        System.out.println("test2");
    }

    @AfterTest
    public void close() {
        System.out.println("after class");
        driver.close();
    }
}
