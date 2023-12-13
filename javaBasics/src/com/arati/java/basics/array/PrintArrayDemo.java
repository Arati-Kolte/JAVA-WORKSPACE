/**
 * 
 */
package com.arati.java.basics.array;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numArray = new int[20];

		int k;
		int j;

		for (k = 0; k < 5; k++) {

			numArray[k] = 10 + k;
		}

		// Print Array Size
		System.out.println("Size of Array is " + k);
		// Print Array element one by one
		for (int i = 0; i < k; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("");
		// insert new element int Array
		for (j = k; j < 10; j++) {
			System.out.println("Enter a number :");
			numArray[j] = scanner.nextInt();
		}

		scanner.close();
		// Print new Array Size
		System.out.println("New Size of Array is " + j);

		for (int i = 0; i < j; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("");

		// sorting the array smallest to largest

		for (int i = 0; i < j - 1; i++) {
			for (int m = i + 1; m < j; m++) {
				if (numArray[i] > numArray[m]) {
					int temp = numArray[i];
					numArray[i] = numArray[m];
					numArray[m] = temp;
				}
			}

		}

		System.out.println("Print sorted Array");
		for (int i = 0; i < j; i++) {
			System.out.print(numArray[i] + " ");
		}

		// sorting the array largest to smallest

		for (int i = 0; i < j - 1; i++) {
			for (int m = i + 1; m < j; m++) {
				if (numArray[i] < numArray[m]) {
					int temp = numArray[i];
					numArray[i] = numArray[m];
					numArray[m] = temp;
				}
			}

		}
		System.out.println("");
		System.out.println("Print sorted Array");
		for (int i = 0; i < j; i++) {
			System.out.print(numArray[i] + " ");
		}

	}

}
