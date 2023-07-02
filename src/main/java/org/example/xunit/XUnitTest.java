package org.example.xunit;

public class XUnitTest {
    public static void main(String[] args) {
        // 33분 까지 들음~~ https://www.youtube.com/watch?v=tdKFZcZSJmg&list=PLv-xDnFD-nnmof-yoZQN8Fs2kVljIuFyC&index=18
        WasRun wasRun = new WasRun("testMethod");
        System.out.println(wasRun.wasRun); // false
        wasRun.run();
        System.out.println(wasRun.wasRun); // true

    }
}
