package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class Finish {

  WebDriver driver;

  public Finish(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
  private WebElement completeHeader;

  public WebElement getCompleteHeader() {
    return completeHeader;
  }
}
