package AppiumTest;

import io.appium.java_client.MobileElement;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weather.excel.WriteResultintoExcel;

import AppiumTest.Driver;

public class Swipe extends Driver {

	public static void swipe() throws InterruptedException{

		Dimension dimensions = Ad.manage().window().getSize();
		System.out.println("dimensions :: "+dimensions);


		List <MobileElement> list =	Ad.findElementsByClassName("android.widget.RelativeLayout");
		for(MobileElement el : list) {
			System.out.println("Mobileelement is::"+el.getText());

		}
		System.out.println("List Size is ::"+list.size()); 

		//Writing data into excel
		WriteResultintoExcel wResult = new WriteResultintoExcel();
		Dimension sizes =null;
		String Adsize =null;
		String AdLocation = null;
		  



		int val=dimensions.getHeight()/25;
		int height =(dimensions.getHeight()-val);
		int width =dimensions.getWidth()/12;
		System.out.println("Val is ::"+val);
		System.out.println("height::"+ dimensions.getHeight()+"   height::"+height);
		System.out.println("width::"+ dimensions.getWidth()+"   width::"+width);
		Thread.sleep(2000);

		//First Ad
		Ad.swipe(0,height, 0, width, 2000);
		Ad.swipe(0,height, 0, width, 2000);

		long start1 = System.currentTimeMillis();
		System.out.println("Start Time :" + start1+" millisec");


		//Ad.findElement(By.className("android.view.View")).isDisplayed();
		//Ad.findElementByClassName("android.webkit.WebView").isDisplayed();
		Ad.findElementByClassName("android.webkit.WebView").isDisplayed();

		long finish1 = System.currentTimeMillis();
		System.out.println("Finish time:"+finish1 + " millisec");
		double totalTime1 = finish1 - start1; 
		//System.out.println("Total Time for page load - "+totalTime1+" millisec"); 
		double time1 = totalTime1/1000;
		System.out.println("Total Time for page load - "+time1+" sec"); 

		//Ad details pull into excel
		sizes =Ad.findElementByClassName("android.webkit.WebView").getSize();

		Adsize = sizes.getWidth()/2+","+sizes.getHeight()/2;
		//Ad.findElementByClassName("android.webkit.WebView").getSize().toString();
		System.out.println(Adsize);
		AdLocation =Ad.findElementByClassName("android.webkit.WebView").getLocation().toString();

		wResult.enterResult("Performance", Adsize, AdLocation, time1, 1,1,2,3);

		System.out.println("**********************************************");

		//Second Ad
		Ad.swipe(0,height, 0, width, 2000);
		//StopWatch pageLoad2 = new StopWatch();
		long start2 = System.currentTimeMillis();
		System.out.println("Start Time :" + start2+" millisec");
		//pageLoad2.start();

		//Ad.findElement(By.className("android.view.View")).isDisplayed();

		Ad.findElementByClassName("android.webkit.WebView").isDisplayed();
		//Ad.findElement(By.className("android.webkit.WebView")).isDisplayed();
		System.out.println("small Ad Displayed with webkit");



		long finish2 = System.currentTimeMillis();
		System.out.println("Finish time:"+finish2 + " millisec");
		double totalTime2 = finish2 - start2; 
		//System.out.println("Total Time for page load - "+totalTime2+" millisec"); 
		double time2 = totalTime2/1000;
		System.out.println("Total Time for page load - "+time2+" sec");  
		System.out.println(Ad.findElementByClassName("android.webkit.WebView").getSize());

		//Ad details pull into excel
		sizes =Ad.findElementByClassName("android.webkit.WebView").getSize();

		Adsize = sizes.getWidth()/2+","+sizes.getHeight()/2;
		//Ad.findElementByClassName("android.webkit.WebView").getSize().toString();
		System.out.println(Adsize);
		AdLocation =Ad.findElementByClassName("android.webkit.WebView").getLocation().toString();

		wResult.enterResult("Performance", Adsize, AdLocation, time2, 2,1,2,3);
		System.out.println("**********************************************");
		//3rd Ad
		Ad.swipe(0,height, 0, width, 2000);
		Ad.swipe(0,height, 0, width, 2000);

		//StopWatch pageLoad3 = new StopWatch();
		long start3 = System.currentTimeMillis();
		System.out.println("Start Time :" + start3+" millisec");
		//pageLoad3.start();

		Ad.findElementByClassName("android.webkit.WebView").isDisplayed();
		//Ad.findElementByClassName("android.widget.FrameLayout").isDisplayed();
		//Ad.findElement(By.className("android.view.View")).isDisplayed();
		System.out.println("Big Ad Displayed with webkit");





		long finish3= System.currentTimeMillis();
		System.out.println("Finish time:"+finish3 + " millisec");
		double totalTime3 = finish3 - start3; 
		//System.out.println("Total Time for page load - "+totalTime3+" millisec"); 
		double time3 = totalTime3/1000;
		System.out.println("Total Time for page load - "+time3+" sec"); 
		System.out.println(Ad.findElementByClassName("android.webkit.WebView").getSize());

		//Ad details pull into excel
		sizes =Ad.findElementByClassName("android.webkit.WebView").getSize();

		Adsize = sizes.getWidth()/2+","+sizes.getHeight()/2;
		//Ad.findElementByClassName("android.webkit.WebView").getSize().toString();
		System.out.println(Adsize);
		AdLocation =Ad.findElementByClassName("android.webkit.WebView").getLocation().toString();

		wResult.enterResult("Performance", Adsize, AdLocation, time3, 3,1,2,3);
		System.out.println("**********************************************");


		//4th Ad
		Ad.swipe(0,height, 0, width, 2000);
		Ad.swipe(0,height, 0, width, 2000);

		//StopWatch pageLoad4 = new StopWatch();
		long start4 = System.currentTimeMillis();
		System.out.println("Start Time :" + start4+" millisec");
		//pageLoad4.start();

		//		Ad.findElement(By.className("android.webkit.WebView")).isDisplayed();
		//		System.out.println("small Add Displayed with webkit");

		Ad.findElementByClassName("android.webkit.WebView").isDisplayed();

		//Ad.findElement(By.className("android.view.View")).isDisplayed();
		//	Ad.findElement(By.className("android.webkit.WebView")).isDisplayed();
		System.out.println("small Ad Displayed with webkit");


		long finish4= System.currentTimeMillis();
		System.out.println("Finish time:"+finish4 + " millisec");
		double totalTime4 = finish4 - start4; 
		//System.out.println("Total Time for page load - "+totalTime4+" millisec"); 
		double time4 = totalTime4/1000;
		System.out.println("Total Time for page load - "+time4+" sec"); 

		System.out.println(Ad.findElementByClassName("android.webkit.WebView").getSize());


		//Ad details pull into excel
		sizes =Ad.findElementByClassName("android.webkit.WebView").getSize();

		Adsize = sizes.getWidth()/2+","+sizes.getHeight()/2;
		//Ad.findElementByClassName("android.webkit.WebView").getSize().toString();
		System.out.println(Adsize);
		AdLocation =Ad.findElementByClassName("android.webkit.WebView").getLocation().toString();

		wResult.enterResult("Performance", Adsize, AdLocation, time4, 4,1,2,3);
		System.out.println("**********************************************");

		//5th Ad
		
		MobileElement ski =(MobileElement) Ad.findElementById("com.weather.Weather:id/grid_item_3");
		WebDriverWait wait = new WebDriverWait(Ad, 20);
		wait.until(ExpectedConditions.visibilityOf(ski));
		
		if(ski.isDisplayed())
		{
		Ad.swipe(0,height, 0, width, 2000);
		Ad.swipe(0,height, 0, width, 2000);
		}else{
			System.out.println("Ski module is not present");
		}
		//StopWatch pageLoad3 = new StopWatch();
		long start5 = System.currentTimeMillis();
		System.out.println("Start Time :" + start5+" millisec");
		//pageLoad3.start();


		//Ad.findElementByClassName("android.widget.FrameLayout").isDisplayed();
		Ad.findElementByClassName("android.webkit.WebView").isDisplayed();
		System.out.println("Big Ad Displayed with webkit");


		long finish5= System.currentTimeMillis();
		System.out.println("Finish time:"+finish5 + " millisec");
		double totalTime5 = finish5 - start5; 
		//System.out.println("Total Time for page load - "+totalTime3+" millisec"); 
		double time5 = totalTime5/1000;
		System.out.println("Total Time for page load - "+time5+" sec"); 
		System.out.println(Ad.findElementByClassName("android.webkit.WebView").getSize());

		//Ad details pull into excel
		sizes =Ad.findElementByClassName("android.webkit.WebView").getSize();

		Adsize = sizes.getWidth()/2+","+sizes.getHeight()/2;
		//Ad.findElementByClassName("android.webkit.WebView").getSize().toString();
		System.out.println(Adsize);
		AdLocation =Ad.findElementByClassName("android.webkit.WebView").getLocation().toString();

		wResult.enterResult("Performance", Adsize, AdLocation, time5, 5,1,2,3);
		System.out.println("**********************************************");

		Ad.swipe(0,height, 0, width, 2000);
		long start6 = System.currentTimeMillis();
		System.out.println("Start Time :" + start6+" millisec");
	}









}


