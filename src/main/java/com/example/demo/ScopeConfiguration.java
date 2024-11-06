package com.example.demo;

import com.example.demo.data.Bar;
import com.example.demo.data.Foo;
import com.example.demo.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.*;

@Configuration
@Slf4j
public class ScopeConfiguration {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope("doubleton", new DoubletonScope());
        return customScopeConfigurer;
    }

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
