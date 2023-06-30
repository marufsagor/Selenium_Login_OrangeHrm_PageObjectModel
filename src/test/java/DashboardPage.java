import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    @FindBy(className = "oxd-userdropdown-img")
    WebElement imgProfile;
    @FindBy(className = "oxd-select-text-input")
    List<WebElement> dropdowns;

    @FindBy(css="Type=submit")
    WebElement btnSubmit;

    public  DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);


    }
}
