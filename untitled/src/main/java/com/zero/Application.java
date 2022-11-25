package com.zero;

import com.zero.bean.A;
import com.zero.bean.B;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther Zero
 * @Date: 2022/11/25 12:21
 */
public class Application {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(context);
		A a = context.getBean("a", A.class);
		B b = context.getBean("b", B.class);
		System.out.println(a);
		System.out.println(b);
	}
}
