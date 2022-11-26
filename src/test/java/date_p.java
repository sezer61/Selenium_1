import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class date_p{
    WebDriver driver;
        @Test
        public void test() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sezer\\IdeaProjects\\Selenium_1\\dri\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demoqa.com/date-picker");

            WebElement sld = driver.findElement(By.id("datePickerMonthYearInput"));
            sld.click();

            WebElement monthElement=driver.findElement(By.className("react-datepicker__month-select"));
            Select select=new Select(monthElement);//

            select.selectByVisibleText("September");

            WebElement yearEle=driver.findElement(By.className("react-datepicker__year-select"));

            select=new Select(yearEle);
            select.selectByVisibleText("1995");

            List<WebElement> dayselement=driver.findElements(By.cssSelector("div.react-datepicker__day"));//webelement listesi oluştur

            String day="14";
            //for döngüsü uygun
            for (WebElement dateelements :dayselement){//webelement üzerinden iter elerleme yap

                String text=dateelements.getText();

                if (text.equals("14")){
                    dateelements.click();
                    break;
                }
            }


        }


}
