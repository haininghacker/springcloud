package cn.terry;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by zhaoguofeng on 2016/11/10.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServer {

    public static void main(String... args) {
        new SpringApplicationBuilder(ConfigServer.class)
                .properties("spring.config.name=configserver").run(args);
    }



}