import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends SetUp {
    DashboardPage dashboardPage;
    LoginPage loginPage;
    @Test
    public  void doLogin(){
       driver.get("https://opensource-demo.orangehrmlive.com/");
       loginPage =new LoginPage(driver);
       loginPage.doLogin();

       String urlActual=driver.getCurrentUrl();
       String urlExpected ="web/index.php/dashboard/index";
       Assert.assertTrue(urlActual.contains(urlExpected));

    }
    @Test
    public void isProfileImageExists(){
         //WebElement imgprofile = driver.findElement(By.className("oxd-userdropdown-img"));
         dashboardPage =new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.imgProfile.isDisplayed());

    }
    @Test
    public void selectEmployementStatus(){
       driver.findElement(By.id("oxd-text oxd-text--span oxd-main-menu-item--name")).click();
        dashboardPage.dropdowns.get(0).click();
        dashboardPage.dropdowns.get(0).sendKeys(Keys.ARROW_DOWN);
        dashboardPage.dropdowns.get(0).sendKeys(Keys.ARROW_DOWN);
        dashboardPage.dropdowns.get(0).sendKeys(Keys.ENTER);
        dashboardPage.btnSubmit.click();


    }
}
