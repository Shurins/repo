package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SingUpPage {

  WebDriver driver;

  public SingUpPage(WebDriver driver) {
    this.driver = driver;
  }


  private String userNameLogin = "standard_user";
  private String userPassword = "secret_sauce";
  private String emptyUserNameLogin = "";
  private String emptyUserPassword = "";


  @FindBy(xpath = "//input[@id='user-name']")
  private WebElement textFieldUsername;

  @FindBy(xpath = "//input[@id='password']")
  private WebElement textFieldPassword;

  @FindBy(xpath = "//input[@class='btn_action']")
  private WebElement buttonLogin;

  @FindBy(xpath = "//div[@class='inventory_item']")
  List<WebElement> inventoryItems;

  @FindBy(xpath = "//h3[text()='Username is required']")
  private WebElement userNameIsRequired;

  @FindBy(xpath = "//div[@class='login-box']/form/h3")
  private WebElement passIsRequired;

  public WebElement getUserNameIsRequired() {
    return userNameIsRequired;
  }

  public WebElement getPassIsRequired() {
    return passIsRequired;
  }

  public void login() {
    textFieldUsername.sendKeys(userNameLogin);
    textFieldPassword.sendKeys(userPassword);
    buttonLogin.click();
  }

  public void emptyLogin() {
    textFieldUsername.sendKeys(emptyUserNameLogin);
    textFieldPassword.sendKeys(userPassword);
    buttonLogin.click();
  }

  public void emptyPassword() {
    textFieldUsername.sendKeys(userNameLogin);
    textFieldPassword.sendKeys(emptyUserPassword);
    buttonLogin.click();
  }

  public void emptyLoginAndPassword() {
    textFieldUsername.sendKeys(emptyUserNameLogin);
    textFieldPassword.sendKeys(emptyUserPassword);
    buttonLogin.click();
  }

}
