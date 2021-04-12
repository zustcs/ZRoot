package cn.zustcs.zroot.user.provider.service;

import cn.zustcs.zroot.user.consumer.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Jun
 * @date 2021/4/12.
 */
@DubboService(version = "${zroot.user.version}")
public class TestServiceImpl implements TestService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
