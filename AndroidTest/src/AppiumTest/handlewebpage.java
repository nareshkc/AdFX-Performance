package AppiumTest;

import io.appium.java_client.MobileElement;

import java.util.List;

import org.openqa.selenium.WebElement;

public class handlewebpage extends Driver{

	public void webhandle() throws InterruptedException{
		Ad.findElementByClassName("android.widget.ImageButton").click();
		Ad.findElementByName("Settings").click();
		
		Ad.findElementByName("Feedback").click();
		
		try{
			
		Ad.findElementByName("Always").click();
		
		
		}catch (Exception e){
			
			System.out.println("Selected browser not fine");
		}
		
		Thread.sleep(10000);
		WebElement edit = Ad.findElementByClassName("android.widget.EditText");
		edit.click();
		edit.sendKeys("Text is entered");
		
		Ad.navigate().back();
		
//		Ad.findElementById("add_suggestion").click();
//		Ad.navigate().back();
		Ad.navigate().back();
		Thread.sleep(2000);
		Ad.findElementByClassName("android.widget.ImageButton").click();
		
	
		
		List <MobileElement> list =	Ad.findElementsByClassName("android.widget.FrameLayout");
		 for(MobileElement el : list) {
		       System.out.println("Mobileelement is::"+el.getText());
		    
		    }
		System.out.println("List Size is ::"+list.size()); 
		
	}
	
	
}
