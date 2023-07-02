package org.example.xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public void add(Test testMethod) {
        tests.add(testMethod);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> {
            t.run(testResult);
        });
    }
}
