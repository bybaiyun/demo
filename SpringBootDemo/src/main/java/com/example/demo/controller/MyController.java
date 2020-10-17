package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author baiyun
 * @date 2020/10/17
 */
@RestController
@Slf4j
public class MyController {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            log.error("程序运行出错，错误原因:{}", e.getMessage());
        } finally {
            log.info("logback日志测试");
        }
    }
}
