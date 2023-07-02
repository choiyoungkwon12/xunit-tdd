package org.example.xunit;

public class WasRun {
    public boolean wasRun;

    public WasRun(String testMethod) {

    }

    public void testMethod() {
        this.wasRun = true;
    }

    public void run() {

    }
}
