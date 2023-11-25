/**
 * 
 */
package com.arati.java.basics.service;

import com.arati.java.basics.beans.InputsBean;

/**
 * @author ARATI-KOLTE
 */
public class ArithmaticOperations {
	
	//Object for InputsBean
	InputsBean bean = new InputsBean();
	
	public void additionDemo(int num1, int num2) {
		bean.setIntNum(num1);
		bean.setIntNum2(num2);
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " +(bean.getIntNum() + bean.getIntNum2()));
		
		System.out.println("Other way");
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " +(num1 + num2));
		
		
		System.out.println("Another way");
		
		int temp = num1 + num2;
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + temp);
		
		System.out.println("one more way");
		
		temp = bean.getIntNum() + bean.getIntNum2();
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + temp);
		
	}
	
	public void additionDemo(double num1, double num2) {
		bean.setDoubleNum(num1);
		bean.setDoubleNum2(num2);
		
		System.out.println("sum of :" + num1 +" and " + num2 + " is " + (bean.getDoubleNum() + bean.getDoubleNum2()));
		
		System.out.println("other way :");
		
		System.out.println("sum of :" + num1 + " and " + num2 + " is " + (num1 + num2));
		
		System.out.println("Another way : ");
		
		double temp = num1 + num2;
		
		System.out.println("sum of :" + num1 + " and " + num2 + " is " + temp);
		
		System.out.println("one more way :");
		
		temp = bean.getDoubleNum() + bean.getDoubleNum2();
		
		System.out.println("sum of " + num1 + " and " + num2 + " is " + temp);
		
	}
	
	public void additionDemo(char char1, char char2) {
		bean.setSingleChar(char1);
		bean.setSingleChar2(char2);
		
		System.out.println(" sum of " + char1 + " and " + char2 + " is " + bean.getSingleChar() + bean.getSingleChar2());
		
		System.out.println("Another way ");
		
		System.out.println(" sum of " + char1 + " and " + char2 + " is " + char1 + char2);
		
		System.out.println("Another way ");
		
		String temp = "" + char1 + char2;
		
		System.out.println("sum of " + char1 + " and " + char2 + " is : " + temp);
		
		System.out.println("one more way ");
		
		temp = "" + bean.getSingleChar() + bean.getSingleChar2();
		
		System.out.println("sum of " + char1 + " and " + char2 + " is " + temp);
	}
	
	public void additionDemo(String char1, String char2) {
		bean.setInputString(char1);
		bean.setInputString2(char2);
		
		System.out.println(" sum of " + char1 + " and " + char2 + " is " + bean.getInputString() + bean.getInputString2());
		
		System.out.println("Another way ");
		
		System.out.println(" sum of " + char1 + " and " + char2 + " is " + char1 + char2);
		
		System.out.println("Another way ");
		
		String temp = char1 + char2;
		
		System.out.println("sum of " + char1 + " and " + char2 + " is : " + temp);
		
		System.out.println("one more way ");
		
		temp = bean.getInputString() + bean.getInputString2();
		
		System.out.println("sum of " + char1 + " and " + char2 + " is " + temp);
	}
	
	public void substractionDemo(int num1, int num2) {
		bean.setIntNum(num1);
		bean.setIntNum2(num2);
		
		System.out.println("Difference of " + num1 + " and " + num2 + " is: " +(bean.getIntNum() - bean.getIntNum2()));
		
		System.out.println("Other way");
		
		System.out.println("Difference of " + num1 + " and " + num2 + " is: " +(num1 - num2));
		
		
		System.out.println("Another way");
		
		int temp = num1 - num2;
		
		System.out.println("Difference of " + num1 + " and " + num2 + " is: " + temp);
		
		System.out.println("one more way");
		
		temp = bean.getIntNum() - bean.getIntNum2();
		
		System.out.println("Difference of " + num1 + " and " + num2 + " is: " + temp);
		
	}
	
	public void substractionDemo(double num1, double num2) {
		bean.setDoubleNum(num1);
		bean.setDoubleNum2(num2);
		
		System.out.println("Difference of :" + num1 +" and " + num2 + " is " + (bean.getDoubleNum() - bean.getDoubleNum2()));
		
		System.out.println("other way :");
		
		System.out.println("Difference of :" + num1 + " and " + num2 + " is " + (num1 - num2));
		
		System.out.println("Another way : ");
		
		double temp = num1 - num2;
		
		System.out.println("Difference of :" + num1 + " and " + num2 + " is " + temp);
		
		System.out.println("one more way :");
		
		temp = bean.getDoubleNum() - bean.getDoubleNum2();
		
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + temp);
		
	}
	
	public void multiplicationDemo(int num1, int num2) {
		bean.setIntNum(num1);
		bean.setIntNum2(num2);
		
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " +(bean.getIntNum() * bean.getIntNum2()));
		
		System.out.println("Other way");
		
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " +(num1 * num2));
		
		
		System.out.println("Another way");
		
		int temp = num1 * num2;
		
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + temp);
		
		System.out.println("one more way");
		
		temp = bean.getIntNum() * bean.getIntNum2();
		
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + temp);
		
	}
	
	public void multiplicationDemo(double num1, double num2) {
		bean.setDoubleNum(num1);
		bean.setDoubleNum2(num2);
		
		System.out.println("Multiplication of :" + num1 +" and " + num2 + " is " + (bean.getDoubleNum() * bean.getDoubleNum2()));
		
		System.out.println("other way :");
		
		System.out.println("Multiplication of :" + num1 + " and " + num2 + " is " + (num1 * num2));
		
		System.out.println("Another way : ");
		
		double temp = num1 * num2;
		
		System.out.println("Multiplication of :" + num1 + " and " + num2 + " is " + temp);
		
		System.out.println("one more way :");
		
		temp = bean.getDoubleNum() * bean.getDoubleNum2();
		
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + temp);
		
	}
	
	public void divisionDemo(int num1, int num2) {
		bean.setIntNum(num1);
		bean.setIntNum2(num2);
		
		System.out.println("division of " + num1 + " and " + num2 + " is: " +(bean.getIntNum() / bean.getIntNum2()));
		
		System.out.println("Other way");
		
		System.out.println("division of " + num1 + " and " + num2 + " is: " +(num1 / num2));
		
		
		System.out.println("Another way");
		
		int temp = num1 / num2;
		
		System.out.println("division of " + num1 + " and " + num2 + " is: " + temp);
		
		System.out.println("one more way");
		
		temp = bean.getIntNum() / bean.getIntNum2();
		
		System.out.println("division of " + num1 + " and " + num2 + " is: " + temp);
		
	}
	
	public void divisionDemo(double num1, double num2) {
		bean.setDoubleNum(num1);
		bean.setDoubleNum2(num2);
		
		System.out.println("division of :" + num1 +" and " + num2 + " is " + (bean.getDoubleNum() / bean.getDoubleNum2()));
		
		System.out.println("other way :");
		
		System.out.println("division of :" + num1 + " and " + num2 + " is " + (num1 / num2));
		
		System.out.println("Another way : ");
		
		double temp = num1 / num2;
		
		System.out.println("division of :" + num1 + " and " + num2 + " is " + temp);
		
		System.out.println("one more way :");
		
		temp = bean.getDoubleNum() / bean.getDoubleNum2();
		
		System.out.println("division of " + num1 + " and " + num2 + " is " + temp);
		
	}
	
}
