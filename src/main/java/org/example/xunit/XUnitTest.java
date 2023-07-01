package org.example.xunit;

public class XUnitTest {
    public static void main(String[] args) {
        // 29: 35
        WasRun wasRun = new WasRun();
        System.out.println(wasRun.wasRun); // false
        wasRun.testMethod();
        System.out.println(wasRun.wasRun); // true

    }
}
