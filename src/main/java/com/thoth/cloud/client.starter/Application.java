package com.thoth.cloud.client.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Justina Chen
 * Date: 8/11/15
 * Time: 8:42 PM
 */

@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

    @Value("${application.name}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
