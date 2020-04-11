package cn.fivemeter.module.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.fivemeter.module.user.dao")
public class ModuleUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleUserApplication.class, args);
    }
}
