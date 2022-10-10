import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckLinksinPAgeusingSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarath_Alexander\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opportunities.epam.com/positions/374179914");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for (WebElement ele:links) {
            String LinkText=ele.getText();
            System.out.println(LinkText);
            
        }
    }
}
