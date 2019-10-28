package org.gugs.test;

public class TestServiceImpl2 implements TestService {
    @Override
    public void test(String name) {
        System.err.println(name + " => " + this.getClass().getName());
    }
}
