package test;

import com.romancode.test.base.BaseTest;
import com.romancode.test.properties.TestDataLoader;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidUsernameAndValidPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(TestDataLoader
                .getInstance()
                .getUserName()
                ,TestDataLoader
                .getInstance()
                .getPassword());
    }
}
