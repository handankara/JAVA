package com.algorithm;

import java.io.IOException;
import java.util.Scanner;
/**
 * @author Handan Kara
 *
 */
public class ReplaceClass 
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner (System.in); //Klavyeden veri almak için bu sınıf kullanılır.
		System.out.print ("Lütfen bir cümle giriniz:");
		String str = sc.nextLine ();
		
		Replace (str);
	}
		
	
	public static void Replace (String str) 
	{
		 char[] chars = str.toCharArray ();
		 int size = chars.length;
		 
		 for (int i = 0; i < size; i++) {
			 
			 if (chars[i] == 'ü') {
			     chars[i] = 'u';
			 }
		 }
		 System.out.print (chars);
	}
}
