package com.javacodes;

import java.util.Scanner;
/*
 * @author Handan KARA
 * 
 */
public class PrimeNumbersDetection 
{
	public static void main(String[] args)
        {
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Lütfen Bir Sayı Giriniz:");
	        int num = sc.nextInt ();
	        primeNumberDetection(num);
        }
	
	public static void primeNumberDetection (int num)
	{
		int i, counter;
		System.out.println("\n 1 'den girilen sayıya kadar olan asal sayıları bulup yazan program.\n");
		
		for (counter = 2; counter < num; counter++) {
			
			for (i= 2; i < counter; i++) {
				if ((counter % i) == 0) 
					break;
		        }
		
		        if (i == counter) 
			    System.out.println (counter + " sayısı asaldır");
		}
        }
}
