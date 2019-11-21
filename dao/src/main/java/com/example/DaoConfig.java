package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mahongyu
 * @date 2019/11/20 21:20
 */
@Configuration
@MapperScan("com.example.dao")
public class DaoConfig {
}
