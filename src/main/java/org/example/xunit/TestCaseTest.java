package org.example.xunit;

import javax.xml.transform.Result;

public class TestCaseTest extends TestCase{
    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        wasRun.run();
        Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
    }

    public void testResult() {
        WasRun wasRun = new WasRun("testMethod");
        TestResult result = wasRun.run();
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        TestResult testResult = new TestResult();
        testResult.testStarted();
        testResult.testFailed();
        Assert.assertEquals("1 run, 1 failed", testResult.getSummary());
    }

    public void testFailedResult() {
        WasRun wasRun = new WasRun("testBrokenMethod");
        TestResult result = wasRun.run();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }
}
