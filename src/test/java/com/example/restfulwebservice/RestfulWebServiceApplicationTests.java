package com.example.restfulwebservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulWebServiceApplicationTests {


	@Autowired
	public ApplicationContext applicationContext;

	@Test
	public void contextLoads() throws Exception {
		System.out.println("START");
		if (applicationContext != null) {
			String[] beans = applicationContext.getBeanDefinitionNames();
			System.out.println("END");
			for (String bean : beans) {
				System.out.println("bean : " + bean);
			}
			System.out.println("END!");
		}
	}


}
