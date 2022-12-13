package ultimateqa.pages;



import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import ultimateqa.customlisteners.CustomListeners;
import ultimateqa.utility.Utility;

public class SignInPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signinLink;
    //By signinLink = By.partialLinkText="Sign");

    @CacheLookup
    @FindBy(id="user[email]")
    WebElement emailField;
   // By emailField = By.id="user[email]");

    @CacheLookup
    @FindBy(id="user[password]")
    WebElement passwordField;
   // By passwordField = By.id="user[password]");

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    WebElement signInButton;
    //By signInButton = By.xpath="//input[@type='submit']");

    @CacheLookup
    @FindBy(xpath="//h1[@class='page__heading']")
    WebElement welcomeText;
   // By welcomeText = By.xpath="//h1[@class='page__heading']");



    public void clickOnSigninLink() {
        Reporter.log("Click on the sign in  Button " + signinLink.toString());
        clickOnElement(signinLink);
        CustomListeners.test.log(Status.PASS, "Click on the sign in Button ");

    }

    public void enterEmailId(String email) {
        Reporter.log("enter email id " + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "enter email id ");
    }

    public void enterPassword(String password) {
        Reporter.log("enter password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "enter password ");
    }

    public void signInButton() {
        Reporter.log("Click on the sign in Button " + signInButton.toString());
        clickOnElement(signInButton);
        CustomListeners.test.log(Status.PASS, "Click on the sign in Button ");
    }

    public String getWelcomeText() {
        Reporter.log("get welcome text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "get welocme text ");
        return getTextFromElement(welcomeText);
    }


}
