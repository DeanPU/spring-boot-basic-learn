package com.example.demo.configuration;

import com.example.demo.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar(){
        return new Bar();
    }
}
