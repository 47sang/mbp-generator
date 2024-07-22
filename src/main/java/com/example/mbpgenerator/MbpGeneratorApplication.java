package com.example.mbpgenerator;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @MapperScan("com.example.mbpgenerator.mapper")
public class MbpGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbpGeneratorApplication.class, args);
    }

    /**
     * mybatis-plus 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
