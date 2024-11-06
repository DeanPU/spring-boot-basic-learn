package com.example.demo;

import com.example.demo.data.cyclic.CyclicA;
import com.example.demo.data.cyclic.CyclicB;
import com.example.demo.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(enforceUniqueMethods = false)
public class CyclicConfiguration {
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicA(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicA(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
