package com.example.demo;

import com.example.demo.data.Car;
import com.example.demo.processor.IdGeneratorBeanPostProcessor;
import com.example.demo.processor.PrefixIdGeneratorBeanPostProcessor;
import com.example.demo.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {
    @Configuration
    @Import({AuthService.class})
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAware() {
        AuthService authService = applicationContext.getBean(AuthService.class);

        System.out.println(authService.getApplicationContext());
        System.out.println(authService.getBeanName());

        Assertions.assertEquals("com.example.demo.service.AuthService", authService.getBeanName());
        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertSame(applicationContext, authService.getApplicationContext());
    }
}
