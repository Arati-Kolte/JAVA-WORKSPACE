/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 */
public class OperatorsAarithamatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		//add two numbers
		int result = num1+ num2;
		//substract two numbers //like this multiplication and division operation can be work
		int result1 = num1-num2;
		System.out.println("result : " +result);
		System.out.println("result : " +result1);
		
		//if we want to increament the value of num1 by 2
	    num1 = num1 + 2;
	    System.out.println("num1 increased value :" + num1);
	    
	    //other way to increament value
	    num1 += 2;
	    System.out.println("num1 increased value other way :"+num1);
	    
	    //another way to increament 
	    num1++;
	    System.out.println("num post-increament value : " + num1);
	    
	    ++num1;
	    System.out.println("num pre-increament value : " + num1);
	    
	    //++num1 and num1++ these two operation will behave differently when you are try to fetch value
	    //example below
	    int resultA = ++num1;//first increament value then fetch
	    int resultB = num1++;//first fetch the value then increament
	    System.out.println("resultA :"+ resultA);
	    System.out.println("resultB :"+ resultB);
	    
	    
	    
	    
	    //if we want to decreament the value of num2 by 5
	    num2 = num2 - 5;
	    //other way to decreament
	    //num2 -=5;
	    //another way
	    //num2--;
	    System.out.println("num2 decreament value : " + num2);
	    //System.out.println("num2 decreament value other way : " + num2);
	    //System.out.println("num2 decreament value another way : " + num2);
	    

	}

}
