package org.gugs.test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class DubboSPITest {

    @Test
    public void sayHello() throws Exception {
        ExtensionLoader<TestService> extensionLoader =
                ExtensionLoader.getExtensionLoader(TestService.class);
        TestService optimusPrime = extensionLoader.getExtension("test1");
        optimusPrime.test("Test1");
        TestService bumblebee = extensionLoader.getExtension("test2");
        bumblebee.test("Test2");
    }
}
