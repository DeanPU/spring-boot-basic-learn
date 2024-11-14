package com.example.demo.service;

import com.example.demo.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired //not recomended
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired //not recomended
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
