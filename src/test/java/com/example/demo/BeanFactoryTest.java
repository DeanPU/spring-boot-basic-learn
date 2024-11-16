package com.example.demo;

import com.example.demo.data.Foo;
import com.example.demo.data.FooBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactory() {
        ObjectProvider<Foo> beanProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> fooList = beanProvider.stream().collect(Collectors.toList());

        System.out.println(fooList);

        Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);

        System.out.println(beans);
    }
}
