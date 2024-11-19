package com.example.demo;

import com.example.demo.application.FooApplication;
import com.example.demo.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpingBoot() {
        Assertions.assertNotNull(foo);
    }
}
