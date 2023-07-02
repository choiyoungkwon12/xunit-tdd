package org.example.xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<TestCase> tests = new ArrayList<>();
    public void add(TestCase testMethod) {
        tests.add(testMethod);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> {
            t.run(testResult);
        });
    }
}
