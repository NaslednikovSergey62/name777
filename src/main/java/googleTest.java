import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTest {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\std\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();


       driver.get("https://play1.automationcamp.ir/expected_conditions.html");

       WebElement input = driver.findElement(By.cssSelector("visibility_trigger"));
       WebElement enableButton = driver.findElement(By.cssSelector());

       googleInput.sendKeys("Фильмы");
       googleInput.sendKeys(Keys.ENTER);

       WebElement firstResult = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
       String firstResultText = firstResult.getText();
       String expectedResult = "Фильмы";
       assert firstResultText.contains(expectedResult);



    //    driver.close();


    }
}
