/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 */
//created class DemoVariables
public class VariablesDemo {
	//declaired instance variable-whithin the class
	 int a = 10;
	 
	 
	 //declaired static variable -declaired with static keyword
	 static int c = 30;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declaired local variable - whithin the method
		int b = 20;
		
		//object creation syntax :<classname><variable like obj>=<new(keyword)><classname>();
		VariablesDemo obj = new VariablesDemo();
		System.out.println("instance variable : " +obj.a); //cannot access instance variable direct as (a),
		                          //to access instance varible we need to create obj inside the method then we call as (obj.a)
		System.out.println("local variable :"+ b);//local variable can be directly accesseble
		System.out.println("static variable :"+c);//static variable can be directiy accesseble
		

	}

}
