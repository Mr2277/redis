package com.test.string;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanFactoryAware ,BeanNameAware,InitializingBean,DisposableBean{
    private String brand;
    private String color;
    private int maxSpeed;
    private BeanFactory beanFactory;
    private String beanName;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public void setBeanName(String s) {

    }

    public void afterPropertiesSet() throws Exception {

    }

    public void destroy() throws Exception {

    }
}
