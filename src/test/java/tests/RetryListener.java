package tests;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, 
                          Constructor testConstructor, Method testMethod) {
        // Automatically sets the retry analyzer for every @Test found
        annotation.setRetryAnalyzer(MyRetryAnalyzer.class);
    }
}
