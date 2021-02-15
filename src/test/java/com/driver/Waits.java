package com.driver;

import com.runner.BaseClass;

public class Waits extends BaseClass{

	
	public void waitForMilliSeconds( int milliSeconds) 
	{
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
