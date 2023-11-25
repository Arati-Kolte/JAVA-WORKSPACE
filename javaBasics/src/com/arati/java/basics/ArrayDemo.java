/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//value stored separately
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//if we want to stored multiple value in 1 variable
		
		int num[] = {6,7,8,9};
		 
		//want to call only one value from array we need to use index number like (0,1,2,3,4,5......)
		//if we call 6
		System.out.println(num[0]);
		
		//if we call 7
		System.out.println(num[1]);
		
		//if call 8
		System.out.println(num[2]);
		
		//if call 9
		System.out.println(num[3]);
		
		//if we want to replace 6 with 5 in ..(int num[] = {6,7,8,9};)
		num[0] = 5;
		System.out.println(num[0]);
		
		//if you dont have values,but you want to create array which will have 4 multiple value then
		//by default all the value of below array will be 0.0.0.0
		int nums[]= new int [4];
		//lets see what is current value for this index numbers(0,1,2,3,4,5.....)
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
		//if we want to replace 0,0,0,0 value with 4,8,3,5
		num [0]=4;
		num [1]=8;
		num [2]=3;
		num [3]=5;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
			
		
	
		
		
	

	}

}
