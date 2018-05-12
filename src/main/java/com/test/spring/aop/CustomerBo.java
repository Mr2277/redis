package com.test.spring.aop;

import org.springframework.stereotype.Component;

@Component
public interface CustomerBo {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
