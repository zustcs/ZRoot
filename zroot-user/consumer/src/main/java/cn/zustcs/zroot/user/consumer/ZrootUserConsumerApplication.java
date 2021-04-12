package cn.zustcs.zroot.user.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Jun
 * @date 2021/4/11.
 */
@SpringBootApplication
public class ZrootUserConsumerApplication {
    @DubboReference(version = "${zroot.user.version}")
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(ZrootUserConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(testService.sayHello("consumer"));
    }
}
