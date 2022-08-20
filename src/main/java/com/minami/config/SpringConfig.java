package com.minami.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.minami")
//写("classpath:jdbc.properties")会找不到文件
@PropertySource(value = "file:///C:\\Code\\SpringTest1\\src\\main\\resources\\jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
