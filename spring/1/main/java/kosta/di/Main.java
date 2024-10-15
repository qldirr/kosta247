package kosta.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resouce = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory =
				new GenericXmlApplicationContext(resouce);
		
		Service service = (Service)factory.getBean("service");
		service.insertService();

	}

}
