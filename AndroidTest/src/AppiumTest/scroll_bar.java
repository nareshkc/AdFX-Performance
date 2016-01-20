package AppiumTest;

import java.util.HashMap;
import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

public class scroll_bar extends Driver{
	public void scrollbar() throws Exception
	{
//		swipe(SwipeElementDirection.UP, 400);
		
		//Ad.swipe(generateX(Ad.scrollTo("December May Not Feel Like").getLocation()), 750, 0, 20, 2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)Ad;
		HashMap<String, Double>  SwipeObject=new HashMap<String,Double>();
		SwipeObject.put("startX", 116.00);
		SwipeObject.put("startY", 750.00);
		SwipeObject.put("startX", 116.00);
		SwipeObject.put("startX", 40.00);
		js.executeScript("mobile: swipe", SwipeObject);
		
		int i =0;
		boolean firstTime =true;
		while(true){
			MobileElement  Element = (MobileElement) Ad.findElementByClassName("android.widget.RelativeLayout");
			List<MobileElement> Text = Element.findElementsByClassName("android.widget.TextView");
			System.out.println("Text is ::"+Text.get(i).getText());
			if(Text.get(i).getText().equalsIgnoreCase("December May Not Feel Like December")){
				System.out.println("The text found");
				
			}else
			{
				System.out.println("Text Not found");
			}
			
		}
		
	}

	private Object generateY(Point location) {
		// TODO Auto-generated method stub
		int y= location.getY();
		return y;
		
	}

	private Object generateX(Point location) {
		// TODO Auto-generated method stub
		int x= location.getX();
		return x;
		
	}
	
	
	public static void horizontalSwipe()
	{
		JavascriptExecutor js = (JavascriptExecutor)Ad;
		HashMap<String, Double>  SwipeObject=new HashMap<String,Double>();
		SwipeObject.put("startX", 116.00);
		SwipeObject.put("startY", 750.00);
		SwipeObject.put("startX", 116.00);
		SwipeObject.put("startX", 40.00);
		js.executeScript("mobile: swipe", SwipeObject);
	}

}
