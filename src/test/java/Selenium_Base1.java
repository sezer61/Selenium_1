import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Base1 {
    WebDriver driver;

    @Test
    public  void test(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sezer\\IdeaProjects\\Selenium_1\\dri\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/slider");

        WebElement sld=driver.findElement(By.cssSelector("input[type='range']"));
        Actions slda=new Actions(driver);

        slda.dragAndDropBy(sld,35,0).build().perform();
        slda.dragAndDropBy(sld,200,0).build().perform();
        slda.dragAndDropBy(sld,-200,0).build().perform();
        slda.dragAndDropBy(sld,35,0).build().perform();

    }
}
