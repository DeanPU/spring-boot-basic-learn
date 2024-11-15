package com.example.demo;

import com.example.demo.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.example.demo.service",
        "com.example.demo.repository",
        "com.example.demo.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
