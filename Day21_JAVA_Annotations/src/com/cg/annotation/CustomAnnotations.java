package com.cg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
//Custom Annotations
@interface CustomB {
	@CustomB(print="RAJ", display = 0)
	
	public void display() {
		System.out.println("Displaying Inherited");
	};
}
class F extends E{
	public void display1() {
		System.out.println("Displaying Inherited-11");
	}
}
public class CustomAnnotations {

	public static void main(String[] args) {
		
		F obj= new F();
		obj.display1();
		obj.display();
		
		Method m= obj.getClass().getMethod("Display");
		CustomB obj1=m.getAnnotation(CustomB.class);
	System.out.println(obj1.print());

	}

}
public String print();


