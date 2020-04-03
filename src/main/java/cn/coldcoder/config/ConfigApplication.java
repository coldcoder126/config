package cn.coldcoder.config;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.Configuration;

/**
 * @Author: DX
 * @Description: 提供小型项目的配置文件服务
 * @Date: 2020/4/3 10:53
 * @Version: 1.0
 */
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }
}
