package org.gugs.test;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface TestService {
    void test(String name);
}
