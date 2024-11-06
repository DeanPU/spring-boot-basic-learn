package com.example.demo;

import com.example.demo.configuration.BarConfiguration;
import com.example.demo.configuration.FooConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({
        "com.example.demo.configuration"
})
public class ScanConfiguration {
}
