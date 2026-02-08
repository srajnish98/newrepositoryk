package tests;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static final int MAX_RETRY = 1; // Retry once

    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess() && count < MAX_RETRY) {
            count++;
            return true; // Tells TestNG to run the test again
        }
        return false;
    }
}
