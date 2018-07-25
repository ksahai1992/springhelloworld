package springhelloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// Object construction | done by Developer
		
		Employee eRef = new Employee();
		eRef.setEid(102);
		eRef.setEname("Karan");
		eRef.setEaddress("RCS");
		
		System.out.println("Employee details" +eRef);
		
		//Spring way | IOC 
			Resource resource = new ClassPathResource("spring.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			
			Employee e1 = (Employee)factory.getBean("emp");
			
			System.out.println("Employee details" +e1);
	}

}
