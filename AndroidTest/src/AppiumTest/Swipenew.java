package AppiumTest;

import io.appium.java_client.MobileElement;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;

import AppiumTest.Driver;

public class Swipenew extends Driver {

	public static void swipe() throws InterruptedException{

		Dimension dimensions = Ad.manage().window().getSize();
		System.out.println("dimensions :: "+dimensions);
		//		int scrollStart = 2300;
		//	 	int scrollEnd = 50;
		//Ad.swipe(0, scrollStart, 0, scrollEnd, 2000);



		List <MobileElement> list =	Ad.findElementsByClassName("android.widget.RelativeLayout");
		for(MobileElement el : list) {
			System.out.println("Mobileelement is::"+el.getText());

		}
		System.out.println("List Size is ::"+list.size()); 

		String feed_1="android.widget.Image";
		String feed_2="android.webkit.WebView";
		int val=dimensions.getHeight()/25;
		int height =(dimensions.getHeight()-val);
		int width =dimensions.getWidth()/12;
		System.out.println("Val is ::"+val);
		System.out.println("height::"+ dimensions.getHeight()+"   height::"+height);
		System.out.println("width::"+ dimensions.getWidth()+"   width::"+width);
		Thread.sleep(2000);
		Time_Start_Stop TSS=new Time_Start_Stop();
		StopWatch pageLoad = new StopWatch();
		long start ;


		for(int i=1;i<=4;i++){

			if(i==1)
			{
				pageLoad.reset();
				Ad.swipe(0,height, 0, width, 2000);
				Ad.swipe(0,height, 0, width, 2000);
				
				start= System.currentTimeMillis();
				System.out.println("Start Time :" + start+" millisec");
				pageLoad.start();
				
				Ad.findElement(By.className("android.view.View")).isDisplayed();
				
				pageLoad.stop();
				//Get the time
				long pageLoadTime_ms = pageLoad.getTime();
				long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
				System.out.println("Total Page Load Time: " + pageLoadTime_ms+ " milliseconds");
				System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
				//Ad.close();
				//md.findElement(By.id("com.weather.Weather:id/ad_view_holder")).isDisplayed();
				long finish = System.currentTimeMillis();
				System.out.println("Finish time:"+finish + " millisec");
				long totalTime = finish - start; 
				System.out.println("Total Time for page load - "+totalTime+" millisec"); 
			}else if(i==2){
				
				pageLoad.reset();

				Ad.swipe(0,height, 0, width, 2000);
				
				start= System.currentTimeMillis();
				System.out.println("Start Time :" + start+" millisec");
				pageLoad.start();
				
				Ad.findElement(By.className("android.webkit.WebView")).isDisplayed();
				
				pageLoad.stop();
				//Get the time
				long pageLoadTime_ms = pageLoad.getTime();
				long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
				System.out.println("Total Page Load Time: " + pageLoadTime_ms+ " milliseconds");
				System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
				//Ad.close();
				//md.findElement(By.id("com.weather.Weather:id/ad_view_holder")).isDisplayed();
				long finish = System.currentTimeMillis();
				System.out.println("Finish time:"+finish + " millisec");
				long totalTime = finish - start; 
				System.out.println("Total Time for page load - "+totalTime+" millisec"); 
			}else if(i==3){
				pageLoad.reset();
				Ad.swipe(0,height, 0, width, 2000);
				Ad.swipe(0,height, 0, width, 2000);
				
				start= System.currentTimeMillis();
				System.out.println("Start Time :" + start+" millisec");
				pageLoad.start();
				
				Ad.findElement(By.className("android.view.View")).isDisplayed();
				
				pageLoad.stop();
				//Get the time
				long pageLoadTime_ms = pageLoad.getTime();
				long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
				System.out.println("Total Page Load Time: " + pageLoadTime_ms+ " milliseconds");
				System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
				//Ad.close();
				//md.findElement(By.id("com.weather.Weather:id/ad_view_holder")).isDisplayed();
				long finish = System.currentTimeMillis();
				System.out.println("Finish time:"+finish + " millisec");
				long totalTime = finish - start; 
				System.out.println("Total Time for page load - "+totalTime+" millisec"); 
				
			}else if(i==4){
				pageLoad.reset();
				Ad.swipe(0,height, 0, width, 2000);
				Ad.swipe(0,height, 0, width, 2000);
				
				start= System.currentTimeMillis();
				System.out.println("Start Time :" + start+" millisec");
				pageLoad.start();
				
				Ad.findElement(By.className("android.webkit.WebView")).isDisplayed();
				
				
				pageLoad.stop();
				//Get the time
				long pageLoadTime_ms = pageLoad.getTime();
				long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
				System.out.println("Total Page Load Time: " + pageLoadTime_ms+ " milliseconds");
				System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
				//Ad.close();
				//md.findElement(By.id("com.weather.Weather:id/ad_view_holder")).isDisplayed();
				long finish = System.currentTimeMillis();
				System.out.println("Finish time:"+finish + " millisec");
				long totalTime = finish - start; 
				System.out.println("Total Time for page load - "+totalTime+" millisec"); 
			}

		}



	}
}


