package AppiumTest;

import org.apache.commons.lang3.time.StopWatch;

public class Time_Start_Stop {
	StopWatch pageLoad = new StopWatch();
	long start ;
	public void Time_Start()
	{ 
		pageLoad.reset();
		start= System.currentTimeMillis();
		System.out.println("Start Time :" + start+" millisec");
		pageLoad.start();
		
	}
	
	public void Time_Stop()
	{
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
