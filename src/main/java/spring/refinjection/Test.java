package spring.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/refinjection/ref-config.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
	}
}
