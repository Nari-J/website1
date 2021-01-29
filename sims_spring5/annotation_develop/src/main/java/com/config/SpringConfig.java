package com.config;

import com.util.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com")
@PropertySource(value="classpath:jdbc.properties")
public class SpringConfig {
    @Bean
    public DataSource dataSource(){
        return new DataSource();
    }
}
