import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name="username")
    WebElement txtUserName;
    @FindBy(css="[type=password]")
    WebElement txtPassword;
    @FindBy(css="[type=submit]")
    WebElement btnSubmit;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void doLogin(){
        txtUserName.sendKeys("admin");
        txtPassword.sendKeys("admin123");
        btnSubmit.click();

    }

}
