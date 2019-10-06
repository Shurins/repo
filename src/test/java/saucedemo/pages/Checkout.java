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


  public String firstName = "Dmitry";

  public String lastName = "Antonov";

  public String postalCode = "12345";


  @FindBy(xpath = "//input[@id='first-name']")
  private WebElement firstNameField;

  @FindBy(xpath = "//input[@id='last-name']")
  private WebElement lastNameField;

  @FindBy(xpath = "//input[@id='postal-code']")
  private WebElement postalCodeField;

  @FindBy(xpath = "//input[@class='btn_primary cart_button']")
  private WebElement continueButton;


  public void fillFields() {
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
  }


  public WebElement getFirstName() {
    return firstNameField;
  }

  public WebElement getLastName() {
    return lastNameField;
  }

  public WebElement getPostalCode() {
    return postalCodeField;
  }

  public WebElement getContinueButton() {
    return continueButton;
  }

}
