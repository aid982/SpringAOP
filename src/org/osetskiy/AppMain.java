package org.osetskiy;


import org.osetskiy.service.FactoryService;
import org.osetskiy.service.ShapeServ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeServ shapeServ = ctx.getBean("shapeService",ShapeServ.class);
		
				// My own AOP implementation 
		//FactoryService factoryService = new FactoryService();
		//ShapeServ shapeServ = (ShapeServ)factoryService.getBean("shapeService");
		//shapeServ.getCircle();
		
		
		System.out.println(shapeServ.getCircle().getName());
	//	System.out.println(shapeServ.getCircle().getName());	
		
	}

}
