package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(baseUrl);// Open the url in the Chrome browser
        driver.manage().window().maximize(); //maximize the window
        System.out.println("Print Title :" + driver.getTitle());// print the title
        System.out.println("Print current URL: " + driver.getCurrentUrl());//Print current Url
        System.out.println("Print PageSource :" + driver.getPageSource());//Print PageSource
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter the username into username field
        driver.findElement(By.name("password")).sendKeys("admin123"); // Enter the Password into Password field
        // driver.close(); //closing the chrome
    }
}
