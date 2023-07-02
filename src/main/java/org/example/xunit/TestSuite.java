package org.example.xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<WasRun> tests = new ArrayList<>();
    public void add(WasRun testMethod) {
        tests.add(testMethod);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> {
            t.run(testResult);
        });
    }
}
