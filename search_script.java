
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class seleniumspringer  {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

		//used to access to link.springer.com and be redirected to the rd page
        driver.navigate().to("https://rd.springer.com/");

        //used to find the search option
		WebElement element = driver.findElement(By.name("search"));

        // searching for the word QoE
        element.sendKeys("QoE");
		//click in the search button to execute command
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        });

        // Should see: "QoE -  on title"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
}