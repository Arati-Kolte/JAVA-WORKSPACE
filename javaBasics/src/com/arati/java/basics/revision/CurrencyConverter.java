/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 */
public class CurrencyConverter {
	//variable declairation and initilization
	int rupee = 63;  //india
	int dirham = 3;  //UAE
	int real = 3;   //brazilian
	int chilean_peso = 595;
	int mexican_peso = 18;
	int _yen = 107;
	int $australian = 2;  //australian doller
	int doller = 1;
	int Rupee = 63;
	
	//in the same class creating method print currencies
	
	void printCurrencies() {
		
		System.out.println("Indian rupee :" + rupee);
		System.out.println("$australian rupee : " + $australian);
		
		//include main method, the first statement creates an object and  
		//in the 2nd statements we are invokeing the printCurrencies method()on the created object
		
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
	}{
	
	}
	
	
	

}
