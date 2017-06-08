package shop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Customer;
import service.CustomerService;

public class CustomerServiceTest {

	@Test
	public void testFindOne() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		CustomerService service = (CustomerService) classPathXmlApplicationContext.getBean("customerService");
		Customer customer = service.findOne(1);
		System.out.println(customer.toString());
	}
	@Test
	public void testfindByName(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		CustomerService service = (CustomerService) classPathXmlApplicationContext.getBean("customerService");
//		service.findByName("itguang");
//		service.findByEmail("1232@qq.com");
	}
	@Test
	public void testsaveOne(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		CustomerService service = (CustomerService) classPathXmlApplicationContext.getBean("customerService");
		Customer customer = new Customer();
		customer.setUsername("admin");
		service.regist(customer);
		
	}

}
