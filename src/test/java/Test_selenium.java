import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test_selenium {
    WebDriver driver;

    @Test
    public  void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sezer\\IdeaProjects\\Selenium_1\\dri\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");

        WebElement id= driver.findElement(By.id("datePickerMonthYearInput"));
        id.click();
        WebElement mo=driver.findElement(By.className("react-datepicker__month-select"));
        Select select=new Select(mo);
        select.selectByVisibleText("September");

        WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
        select=new Select(year);
        select.selectByVisibleText("1996");

        List<WebElement> day=driver.findElements(By.cssSelector("div.react-datepicker__day"));

        String day14="14";

        for (WebElement dayelements:day){
            String text=dayelements.getText();

            if (text.equals("14")){
                dayelements.click();
                break;
            }
        }


    }
}
