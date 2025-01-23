package com.example.demo;


import com.example.demo.dao.AdminCredentailDao;
import com.example.demo.testclasses.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(PracticeAppApplication.class, args);
//		Alien a=context.getBean(Alien.class);
//		//Alien a1=context.getBean(Alien.class);
//		a.show();
		//a1.show();
//		AdminCredentailDao a=context.getBean(AdminCredentailDao.class);
//		//a.createTableUserDetails();
//		a.createTableUserCredentail();

	}

}
