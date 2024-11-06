package com.example.demo;

import com.example.demo.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependOnConfiguration.class);
    }

    @Test
    void testDependOn(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
