package JerkinNopCom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    BrowserSelector browserSelector = new BrowserSelector();
    HomePage homePage = new HomePage();
    Utils utils = new Utils();
   // RegisterPage registerPage = new RegisterPage();
   // String expectedRegisterUrl = "http://demo.nopcommerce.com/register";
    //String ExpextedSucMsg = "Thank you for registartion";


@Test
    public void verifyUserShouldClickOnElectronics(){
        homePage.clickOnElectronic();
    Assert.assertEquals("Electronics","Electronics");
    }

    @Test
    public void verifyUserShouldClickOnJwellery(){
    homePage.clickOnJewelary();
    Assert.assertEquals("Jewelry","Jewelry");
    }
//@Test
//    public void verifyUserShouldAbleToRegister(){
//    registerPage.registerUser();
//    Assert.assertTrue(driver.getCurrentUrl().contains(expectedRegisterUrl), "Register url is not correct\n");
//
//    Assert.assertEquals("Thank you for registartion", ExpextedSucMsg);
//}
//   // Assert.assertEquals("Thank you for registartion","Thank you for registartion");

}

