package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
	@Test(invocationCount = 3)
	public void calls() {
		Reporter.log("calls",true);
	}

	@Test(enabled=false)
	public void setting() {
		Reporter.log("settings",true);
	}

	@Test(priority = 1)
	public void chats() {
		Reporter.log("chats",true);
	}
}
