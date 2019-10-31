package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.webdriverInit.WebDriverInit;
import saucedemo.pages.SingUpPage;

public class SingUp extends WebDriverInit {


  @Test
  public void singUp() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.login();
    Assert.assertEquals(singUpPage.getStrTitle(), singUpPage.getTitle());
  }

  @Test
  public void singUpEmptyLogin() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyLogin();
    Assert.assertEquals(singUpPage.getStrUsernameIsRequired(), singUpPage.getUserNameIsRequired().getText());
  }

  @Test
  public void singUpEmptyPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyPassword();
    Assert.assertEquals(singUpPage.getStrPasswordIsRequired(), singUpPage.getPassIsRequired().getText());
  }

  @Test
  public void singUpEmptyLoginAndPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyLoginAndPassword();
    Assert.assertEquals(singUpPage.getStrUsernameIsRequired(), singUpPage.getUserNameIsRequired().getText());
  }

  @Test
  public void incorrectLogin() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.getFieldUsername().sendKeys(singUpPage.incorrectLogin());
    singUpPage.getFieldPassword().sendKeys(singUpPage.getUserPassword());
    singUpPage.getButtonLogin().click();
    Assert.assertEquals(singUpPage.getStrUsernameAndPassDoNotMatch(), singUpPage.getUsernameAndPassDoNotMatch().getText());
  }

  @Test
  public void incorrectPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.getFieldUsername().sendKeys(singUpPage.getUserNameLogin());
    singUpPage.getFieldPassword().sendKeys(singUpPage.incorrectPassword());
    singUpPage.getButtonLogin().click();
    Assert.assertEquals(singUpPage.getStrUsernameAndPassDoNotMatch(), singUpPage.getUsernameAndPassDoNotMatch().getText());
  }

  @Test
  public void incorrectLoginAndPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.incorrectLoginAndPassword();
    Assert.assertEquals(singUpPage.getStrUsernameAndPassDoNotMatch(), singUpPage.getUsernameAndPassDoNotMatch().getText());
  }

}