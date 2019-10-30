package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String test(String name) {
        System.err.println("==============TestServiceImpl=============");
        return "com.alibaba.dubbo.demo.provider.TestServiceImpl ========> [" + name + "]";
    }
}
