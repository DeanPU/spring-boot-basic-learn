package com.example.demo;

import com.example.demo.client.PaymentGatewayClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PaymentGatewayClient.class)
public class FactoryConfiguration {
}
