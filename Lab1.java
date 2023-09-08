import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.name("username")); //name utgig idewhjulne
        username.sendKeys("student"); //name utga dr utga butsaana
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement click = driver.findElement(By.cssSelector("#form > button"));
        click.click();
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
        logout.click();

    }
}
