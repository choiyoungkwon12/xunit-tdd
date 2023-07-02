package org.example.xunit;

import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(method -> AnnotationUtils.findAnnotation(method, org.example.xunit.annotation.Test.class) != null)
                .forEach(method -> {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(method.getName()));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public TestSuite() {}

    public void add(Test testMethod) {
        tests.add(testMethod);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> {
            t.run(testResult);
        });
    }
}
