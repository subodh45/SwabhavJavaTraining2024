package com.Aurionpro.Reflection;
import java.lang.reflect.*;

public class ReflectionTest {
 public static void main(String[] args) throws ClassNotFoundException {
	
	 Class classString = Class.forName("java.lang.String");
	 
	 System.out.println(classString.getName());
	 System.out.println(classString.getSimpleName());
	 
	 Method methods[]=classString.getMethods();
	 
	 for(Method method:methods)
	 {
		 System.out.println(method.getName() + "\t"+ method.getParameterCount());
		 
		 Parameter parameters[]=method.getParameters();
		 
		 for(Parameter parameter:parameters)
		 {
			 System.out.println(parameter.getName()+ "\t"+ parameter.getType());
		 }
	 }
	 
	 Constructor constructors[]=classString.getConstructors();
	 
	 for(Constructor constructor:constructors)
	 {
		 System.out.println(constructor.getName());
	 }
	 
	 
}
}
