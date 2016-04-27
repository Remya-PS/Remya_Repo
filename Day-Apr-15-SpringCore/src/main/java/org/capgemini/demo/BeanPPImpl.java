package org.capgemini.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPPImpl implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("postProcessAfterInitialization -->" +beanName );
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String  beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization -->" +beanName );
		return bean;
	}

}