package ultimateqa.pages;



import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import ultimateqa.customlisteners.CustomListeners;
import ultimateqa.utility.Utility;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy (id="user[email]")
    WebElement emailField;
    //By emailField = By.id="user[email]");

    @CacheLookup
    @FindBy(name="user[password]")
    WebElement passwordField;
    //By passwordField = By.name="user[password]");


    public void enterEmailId(String email) {
        Reporter.log("Enter Email " + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Click on the login Button ");
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, " Enter Password ");
    }

}
