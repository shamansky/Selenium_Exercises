package Section11;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class L17_ITestListener implements ITestListener{
	public void onTestFailure(ITestResult resul) {
		System.out.println("Test has failed. This message is from the ITestListener interface");
	}
	
	public void onTestSuccess(ITestResult resul) {
		System.out.println("Test has passed. This message is from the ITestListener interface");
	}
}
