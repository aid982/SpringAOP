package org.osetskiy.service;

import org.osetskiy.aspect.LoggingAspect;
import org.osetskiy.model.Circle;

public class ShapeServProxy extends ShapeServ {
	public Circle getCircle() {
		new LoggingAspect().loggingFromMyAdvice();
		return super.getCircle();
	}
	
	public void Test1(){
		
	}

}
