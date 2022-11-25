package com.zero;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther Zero
 * @Date: 2022/11/26 1:30
 */
public class MyApplicationContext extends ClassPathXmlApplicationContext {
	public MyApplicationContext(String... configLocation) throws BeansException {
		super(configLocation);
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// 禁止循环依赖
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
