package cn.terry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoguofeng on 2016/11/9.
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class Test {

//    @Value("${config.name}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello 1" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }

}
