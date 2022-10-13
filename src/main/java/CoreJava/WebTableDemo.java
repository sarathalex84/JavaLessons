import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WebTableDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        List<WebElement> headers = driver.findElements(By.xpath("th//[@id=tableheader")); //list of headers webelements
        System.out.println(headers.size());// will print the count of headers present on table
//to capture all the header elements , can use for loop
        boolean status=false;
        for (WebElement ele : headers) {
            String value = ele.getText();
            System.out.println(value);
            if(value.contains("Country")){
                status=true;
                break;
            }
        }
        Assert.assertTrue(status, "element is present");

    }
}
