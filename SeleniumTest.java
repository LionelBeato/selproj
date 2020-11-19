import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assumptions.*;

public class SeleniumTest {

    public enum Browser{
        CHROME, FIREFOX
    }

    WebDriver driver;
    String expected;
    String actual;

    Browser browser;

//    @BeforeEach
    void setUp(){
        browser = Browser.CHROME;
        if (browser.equals(Browser.CHROME)){
            System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        }
    }
:
    @Test
    void preTest(){
        assumeTrue(false);
        System.out.print("That is true!\n");
    }

    @Test
    void test(){
        assumeTrue(browser.equals(Browser.CHROME)); // 👈 This won't run unless the assumption is met
        assertThat(driver.getCurrentUrl(), equalTo(expected));
    }

//    @AfterEach
    void tearDown(){
        driver.close();
    }

}
