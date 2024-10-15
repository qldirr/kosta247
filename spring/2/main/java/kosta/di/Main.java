package kosta.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		
//		BeanFactory factory =
//				new GenericXmlApplicationContext(resource);
		
//		ApplicationContext factory =
//				new GenericXmlApplicationContext(resource);
		
		
//		ApplicationContext factory =
//				new AnnotationConfigApplicationContext(Factory.class);		
		
		String configLocation[] = {
				"applicationContext.xml",
				"commonConcern.xml"
		};
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext(configLocation);		
		
		//Service service = (Service)factory.getBean("writeService");//service=>writeService
		Kosta service = (Kosta)factory.getBean("kostaService");
		service.insertService();

	}

}



