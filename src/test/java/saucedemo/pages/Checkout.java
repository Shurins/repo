package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {

  WebDriver driver;

  public Checkout(WebDriver driver) {
    this.driver = driver;
  }

  private String firstName = "Dmitry";
  private String lastName = "Antonov";
  private String postalCode = "12345";
  private String emptyString = "";
  private String errorFirstNameNotification = "Error: First Name is required";
  private String errorLastNameNotification = "Error: Last Name is required";
  private String errorPostalCodeNotification = "Error: Postal Code is required";


  @FindBy(xpath = "//input[@id='first-name']")
  private WebElement firstNameField;

  @FindBy(xpath = "//input[@id='last-name']")
  private WebElement lastNameField;

  @FindBy(xpath = "//input[@id='postal-code']")
  private WebElement postalCodeField;

  @FindBy(xpath = "//input[@class='btn_primary cart_button']")
  private WebElement continueButton;

  @FindBy(xpath = "//h3")
  private WebElement errorNotification;


  public void fillFieldsWithCorrectData() {
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
  }

  public void fillIncorrectFirstName(){
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(emptyString);
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
  }

  public void fillIncorrectLastName(){
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(emptyString);
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
  }

  public void fillIncorrectPostalCode(){
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(emptyString);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getEmptyString() {
    return emptyString;
  }

  public WebElement getFirstNameField() {
    return firstNameField;
  }

  public WebElement getLastNameField() {
    return lastNameField;
  }

  public WebElement getPostalCodeField() {
    return postalCodeField;
  }

  public WebElement getContinueButton() {
    return continueButton;
  }

  public WebElement getErrorNotification() {
    return errorNotification;
  }

  public String getErrorFirstNameNotification() {
    return errorFirstNameNotification;
  }

  public String getErrorLastNameNotification() {
    return errorLastNameNotification;
  }

  public String getErrorPostalCodeNotification() {
    return errorPostalCodeNotification;
  }

}
