package pages;

import com.romancode.test.base.BasePage;
import com.romancode.test.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage  {

    @FindBy(name = "username")
    private WebElement usernameTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement loginButton;


    public LoginPage() {

        PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
    }


    public void loginToApplication(String usernameValue,String passwordValue){
        super.sendKeys(usernameTextBox,"username text box",usernameValue);
        super.sendKeys(passwordTextBox,"Password text box",passwordValue);
        super.click(loginButton,"Login btn");
    }
}
