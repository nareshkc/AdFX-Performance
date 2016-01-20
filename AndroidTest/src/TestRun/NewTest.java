package TestRun;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import AppiumTest.Capabilities_android;
import AppiumTest.Swipe;
import AppiumTest.Swipenew;
import AppiumTest.handlewebpage;
import AppiumTest.scroll_bar;

public class NewTest {
  @Test
  public void f() throws Exception {
	  Thread.sleep(2000);
	  
//	  scroll_bar sb = new scroll_bar();
//	  sb.scrollbar();
//	  handlewebpage hwp=new handlewebpage();
//	  hwp.webhandle();
	  Swipe.swipe();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	  Capabilities_android ca= new Capabilities_android();
	  ca.dcap();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
