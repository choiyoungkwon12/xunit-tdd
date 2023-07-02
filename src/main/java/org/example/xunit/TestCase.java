package org.example.xunit;

import javax.xml.transform.Result;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult testResult) {
        testResult.testStarted();
        setUp();
        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            testResult.testFailed();
        }

        tearDown();
    }

    public void setUp() {}
    public void tearDown() {}
}
