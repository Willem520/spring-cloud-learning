package com.start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/14
 */
@SpringBootApplication
@RestController
@RefreshScope
public class CloudConfigClientApplication {
    @Value("${message:World!}")
    String message;

    @RequestMapping("/")
    public String hello() {
        return "Hello, " + message + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class,args);
    }
}
