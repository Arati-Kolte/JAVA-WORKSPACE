/**
 * 
 */
package com.arati.java.basics.cj;

import java.util.Scanner;

import com.arati.java.basics.beans.InputsBean;

/**
 * @author ARATI-KOLTE
 */
public class ReadwriteOperations {
	
	//Object for InputsBean
	Scanner scanner = new Scanner(System.in);
	
	//Object for Scanner
	InputsBean numberBean = new InputsBean();
	
	//Method used for read and write Integer value
	public void readWriteInt() {
		
		System.out.println("Enter a integer number : ");
		
		numberBean.setIntNum(scanner.nextInt());
		
		System.out.println("Provided integer Number by user is : " + numberBean.getIntNum());		
		
	}
	
	//Method used for read and write double value
	public void readWriteDouble() {
		
		System.out.println("Enter a floating point number : ");
		
		numberBean.setDoubleNum(scanner.nextDouble());
		
		System.out.println("Provided floating point Number by user is : " + numberBean.getDoubleNum());		
		
	}
	
	//Method used for read and write character value
	public void readWriteCharValue() {
		
		System.out.println("Enter a Character : ");
		
		numberBean.setSingleChar(scanner.next().charAt(0));;
		
		System.out.println("Provided Character by user is : " + numberBean.getSingleChar());		
		
	}
	
	//Method used for read and write String value
	public void readWriteStringValue() {
		
		System.out.println("Enter a String : ");
		
		numberBean.setInputString(scanner.next());
		
//		if(scanner.hasNext()) {
//			numberBean.setInputString(scanner.nextLine());
//		}
		
		
		System.out.println("Provided String by user is : " + numberBean.getInputString());		
		
	}
}
