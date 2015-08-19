package com.javacodes;

import java.util.Scanner;
/*
 * @author Handan KARA
 * 
 */
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        	System.out.print ("Lütfen Bir Sayı Giriniz : ");
		int num = scanner.nextInt();
        	primeNumber (num);
	}
	
	public static String primeNumber (int num)
	{
        	if (num > 1) {

              		for (int i = 2; i <= num; i++) {
            	   
                   		if (num % i == 0) {
                	    	    System.out.println (num + " asal sayı değildir. ");
                       	            break;
                                }

                                if (i == (num - 1)) {
                       	            System.out.println (num + " asal sayıdır.");
                       	            break;
                                }
                        }
                } 
                else if (num <= 1) {
                     System.out.println ("Lütfen 1 den büyük pozitif bir tam sayı giriniz!");
        	}
	        return null;
	}
}
