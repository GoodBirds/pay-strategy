package com.liwei.paystrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//注意此处是引入tk.mybatis.spring.annotation.MapperScan
@MapperScan("com.liwei.paystrategy.mapper")
@SpringBootApplication
public class PayStrategyApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayStrategyApplication.class, args);
    }
}
