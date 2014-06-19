package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springmvc.anotation.testbean.MySpringBeanWithDependency;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("../../WEB-INF/spring/appServlet/servlet-context.xml");
		BeanFactory factory = context;
		
		MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory.getBean("mySpringBeanWithDependency");
		test.run();
	}

}
