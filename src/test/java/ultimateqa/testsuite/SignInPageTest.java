package ultimateqa.testsuite;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ultimateqa.customlisteners.CustomListeners;
import ultimateqa.pages.SignInPage;
import ultimateqa.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class SignInPageTest extends BaseTest {
    SignInPage signInPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        signInPage = new SignInPage();
    }
    @Test(groups = {"sanity" ,"regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {

        //click on Sign in link
        signInPage.clickOnSigninLink();

        //This is requirement
        Assert.assertEquals("Welcome Back!","Welcome Back!");

}}
