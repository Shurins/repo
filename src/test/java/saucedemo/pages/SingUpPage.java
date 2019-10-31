package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import java.util.Random;

public class SingUpPage {

  WebDriver driver;

  public SingUpPage(WebDriver driver) {
    this.driver = driver;
  }

  private String userNameLogin = "standard_user";
  private String userPassword = "secret_sauce";
  private String emptyUserNameLogin = "";
  private String emptyUserPassword = "";
  private String title = "Swag Labs";
  private String strUsernameIsRequired = "Epic sadface: Username is required";
  private String strPasswordIsRequired = "Epic sadface: Password is required";
  private String strUsernameAndPassDoNotMatch = "Epic sadface: Username and password do not match any user in this service";

  @FindBy(xpath = "//input[@id='user-name']")
  private WebElement fieldUsername;

  @FindBy(xpath = "//input[@id='password']")
  private WebElement fieldPassword;

  @FindBy(xpath = "//input[@class='btn_action']")
  private WebElement buttonLogin;

  @FindBy(xpath = "//div[@class='inventory_item']")
  List<WebElement> inventoryItems;

  @FindBy(xpath = "//h3[text()='Username is required']")
  private WebElement userNameIsRequired;

  @FindBy(xpath = "//div[@class='login-box']/form/h3")
  private WebElement passIsRequired;

  @FindBy(xpath = "//h3[@data-test='error']")
  private WebElement usernameAndPassDoNotMatch;

  @FindBy(xpath = "//title")
  private WebElement singUpPageTitle;


  public String getStrUsernameIsRequired() {
    return strUsernameIsRequired;
  }

  public String getStrPasswordIsRequired() {
    return strPasswordIsRequired;
  }

  public String getStrUsernameAndPassDoNotMatch() {
    return strUsernameAndPassDoNotMatch;
  }

  public String getUserNameLogin() {
    return userNameLogin;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public WebElement getButtonLogin() {
    return buttonLogin;
  }

  public String getTitle() {
    return title;
  }

  public WebElement getFieldUsername() {
    return fieldUsername;
  }

  public WebElement getFieldPassword() {
    return fieldPassword;
  }

  public WebElement getUserNameIsRequired() {
    return userNameIsRequired;
  }

  public WebElement getPassIsRequired() {
    return passIsRequired;
  }

  public WebElement getUsernameAndPassDoNotMatch() {
    return usernameAndPassDoNotMatch;
  }

  public WebElement getSingUpPageTitle() {
    return singUpPageTitle;
  }

  public WebDriver getDriver() {
    return driver;
  }

  public void login() {
    fieldUsername.sendKeys(userNameLogin);
    fieldPassword.sendKeys(userPassword);
    buttonLogin.click();
  }

  public void emptyLogin() {
    fieldUsername.sendKeys(emptyUserNameLogin);
    fieldPassword.sendKeys(userPassword);
    buttonLogin.click();
  }

  public void emptyPassword() {
    fieldUsername.sendKeys(userNameLogin);
    fieldPassword.sendKeys(emptyUserPassword);
    buttonLogin.click();
  }

  public void emptyLoginAndPassword() {
    fieldUsername.sendKeys(emptyUserNameLogin);
    fieldPassword.sendKeys(emptyUserPassword);
    buttonLogin.click();
  }

  public String incorrectLogin() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz[|]'~<!--@/*$%^&#*/()?>,.*/1234567890";
    String incorrectLogin = "";
    Random random = new Random();

    int lenght = random.nextInt(10);
    char[] text = new char[lenght];

    for (int i = 0; i < lenght; i++) {
      text[i] = characters.charAt(random.nextInt(characters.length()));
    }

    for (int i = 0; i < text.length; i++) {
      incorrectLogin += text[i];
    }
    return incorrectLogin;
  }

  public String incorrectPassword() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz[|]'~<!--@/*$%^&#*/()?>,.*/1234567890";
    String incorrectPassword = "";
    Random random = new Random();

    int lenght = random.nextInt(10);
    char[] text = new char[lenght];

    for (int i = 0; i < lenght; i++) {
      text[i] = characters.charAt(random.nextInt(characters.length()));
    }

    for (int i = 0; i < text.length; i++) {
      incorrectPassword += text[i];
    }
    return incorrectPassword;
  }

  public void incorrectLoginAndPassword() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz[|]'~<!--@/*$%^&#*/()?>,.*/1234567890";
    String randomLogin = "";
    String randomPassword = "";

    Random random = new Random();

    int lenght = random.nextInt(10);
    char[] text = new char[lenght];

    for (int i = 0; i < lenght; i++) {
      text[i] = characters.charAt(random.nextInt(characters.length()));
    }

    for (int i = 0; i < text.length; i++) {
      randomLogin += text[i];
      randomPassword += text[i];
    }
    fieldUsername.sendKeys(randomLogin);
    fieldPassword.sendKeys(randomPassword);
    buttonLogin.click();
  }

}