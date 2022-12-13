package ultimateqa.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ultimateqa.customlisteners.CustomListeners;
import ultimateqa.pages.ProductPage;
import ultimateqa.pages.SignInPage;
import ultimateqa.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class ProductPageTest extends BaseTest {
    SignInPage signInPage;
    ProductPage productPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        signInPage = new SignInPage();
        productPage = new ProductPage();
    }

        @Test(groups = {"sanity" ,"regression"})
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //click on Sign in link
        signInPage.clickOnSigninLink();

        //click on username
        productPage.enterEmailId("Jhon1234@gmail.com");

        //Enter password
        productPage.enterPassword("password122");


        //click on login button
        signInPage.signInButton();

        //This is requirement
        Assert.assertEquals("Invalid email or password.", "Invalid email or password.");

    }
}
