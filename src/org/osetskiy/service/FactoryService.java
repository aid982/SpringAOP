package org.osetskiy.service;

import org.osetskiy.model.Circle;

public class FactoryService {
	public Object getBean(String beanType){
		if (beanType.equals("shapeService")) return  new ShapeServProxy();
		if (beanType.equals("circle")) return  new Circle();
		return  null;
		
	}

}
