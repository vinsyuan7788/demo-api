package com.demo.api.web;

import com.demo.base.common.utils.LogUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Vince Yuan
 * @date 12/29/2020
 */
@Slf4j
@SpringBootApplication(scanBasePackages = { "com.demo.*" })
public class DemoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiApplication.class, args);
        log.info(LogUtils.getLogMessage("API application has been started successfully"));
    }
}
