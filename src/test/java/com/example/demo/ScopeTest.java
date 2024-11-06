package com.example.demo;

import com.example.demo.data.Bar;
import com.example.demo.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope(){
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);
    }

    @Test
    void testDoubletonScope() {
        Bar bean1 = applicationContext.getBean(Bar.class);
        Bar bean2 = applicationContext.getBean(Bar.class);
        Bar bean3 = applicationContext.getBean(Bar.class);
        Bar bean4 = applicationContext.getBean(Bar.class);

        Assertions.assertNotSame(bean1, bean2);
        Assertions.assertNotSame(bean3, bean4);
        Assertions.assertSame(bean1, bean3);
        Assertions.assertSame(bean2, bean4);

    }
}
