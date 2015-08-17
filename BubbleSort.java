package com.algorithm;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author handan
 *
 */
public class BubbleSort 
{
	
	public static void main (String[] args) throws IOException 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dizinin eleman Sayısı:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("\n" + (i+1) + ".sayı = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nSayıların Sıralanmamış Hali:");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		
		bubbleSort (arr, size);
		
		System.out.print("\nSayıların Sıralanmış Hali");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
	}
	
	public static void bubbleSort (int arr[], int size)
	{
		
		int temp;
		
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < (size - 1); j++) {
				if (arr[j] >= arr[j+1]) {
					temp = arr[j];
	                   		arr[j] = arr[j+1];
	                                arr[j+1] = temp;
	                        }
			
			}
		}
	}
}
