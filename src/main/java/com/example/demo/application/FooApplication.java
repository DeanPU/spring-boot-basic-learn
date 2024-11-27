package com.example.demo.application;

import com.example.demo.data.Bar;
import com.example.demo.data.Foo;
import com.example.demo.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo(){
        return new Foo();
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FooApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setListeners(List.of(new AppStartingListener()));

        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
