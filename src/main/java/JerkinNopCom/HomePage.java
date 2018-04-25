package JerkinNopCom;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void clickOnElectronic(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement(By.linkText("Electronics"));
    }
    public void clickOnJewelary(){
        clickElement(By.linkText("Jewelry"));
    }
}
