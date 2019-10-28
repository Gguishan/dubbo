package org.gugs.test;

public class TestServiceImpl1 implements TestService {
    @Override
    public void test(String name) {
        System.err.println(name + " => " + this.getClass().getName());
    }
}
