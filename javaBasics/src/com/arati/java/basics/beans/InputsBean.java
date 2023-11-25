/**
 * 
 */
package com.arati.java.basics.beans;

/**
 * @author ARATI-KOLTE
 */

//create a class InputBean
public class InputsBean {
	
	//Declare two integer variables
	
	private int intNum;
	
	private int intNum2;
	
	//Declare two double variables
	
	private double doubleNum;
	
	private double doubleNum2;
	
	//Declare two char variables
	
	private char singleChar;
	
	private char singleChar2;
	
	//Declare two string variables
	
	private String inputString;
	
	private String inputString2;

	/**
	 * @return the intNum
	 */
	//created method to read a input integer value
	public int getIntNum() {
		return intNum;
	}

	/**
	 * @param intNum the intNum to set
	 */
	//created method to write integer value
	
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	/**
	 * @return the intNum2
	 */
	public int getIntNum2() {
		return intNum2;
	}

	/**
	 * @param intNum2 the intNum2 to set
	 */
	public void setIntNum2(int intNum2) {
		this.intNum2 = intNum2;
	}

	/**
	 * @return the doubleNum
	 */
	public double getDoubleNum() {
		return doubleNum;
	}

	/**
	 * @param doubleNum the doubleNum to set
	 */
	public void setDoubleNum(double doubleNum) {
		this.doubleNum = doubleNum;
	}

	/**
	 * @return the doubleNum2
	 */
	public double getDoubleNum2() {
		return doubleNum2;
	}

	/**
	 * @param doubleNum2 the doubleNum2 to set
	 */
	public void setDoubleNum2(double doubleNum2) {
		this.doubleNum2 = doubleNum2;
	}

	/**
	 * @return the singleChar
	 */
	public char getSingleChar() {
		return singleChar;
	}

	/**
	 * @param singleChar the singleChar to set
	 */
	public void setSingleChar(char singleChar) {
		this.singleChar = singleChar;
	}

	/**
	 * @return the singleChar2
	 */
	public char getSingleChar2() {
		return singleChar2;
	}

	/**
	 * @param singleChar2 the singleChar2 to set
	 */
	public void setSingleChar2(char singleChar2) {
		this.singleChar2 = singleChar2;
	}

	/**
	 * @return the inputString
	 */
	public String getInputString() {
		return inputString;
	}

	/**
	 * @param inputString the inputString to set
	 */
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	/**
	 * @return the inputString2
	 */
	public String getInputString2() {
		return inputString2;
	}

	/**
	 * @param inputString2 the inputString2 to set
	 */
	public void setInputString2(String inputString2) {
		this.inputString2 = inputString2;
	}

	/**
	 * @param intNum
	 * @param intNum2
	 * @param doubleNum
	 * @param doubleNum2
	 * @param singleChar
	 * @param singleChar2
	 * @param inputString
	 * @param inputString2
	 */
	public InputsBean() {
		super();
		this.intNum = 0;
		this.intNum2 = 0;
		this.doubleNum = 0;
		this.doubleNum2 = 0;
		this.singleChar = ' ';
		this.singleChar2 = ' ';
		this.inputString = "";
		this.inputString2 = "";
	}

	
	
	
	
}
