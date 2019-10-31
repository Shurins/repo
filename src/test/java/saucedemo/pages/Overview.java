package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview {

  WebDriver driver;

  public Overview(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//a[@class='btn_action cart_button']")
  private WebElement finishButton;

  @FindBy(xpath = "//a[@class='cart_cancel_link btn_secondary']")
  private WebElement cancelButton;

  @FindBy(xpath = "//div[text()='Payment Information:']")
  private WebElement paymentInformation;

  public WebElement getFinishButton() {
    return finishButton;
  }

  public WebElement getCancelButton() {
    return cancelButton;
  }

  public WebElement getPaymentInformation() {
    return paymentInformation;
  }

}
