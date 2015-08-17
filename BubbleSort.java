package com.algorithm;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author handan
 *
 */
public class BubbleSort {
	
	public static void main (String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dizinin eleman Sayısı:");
		int total = sc.nextInt();
		
		int arr[] = new int[total];
		
		for(int i = 0; i < total; i++)
		{
			System.out.print("\n" + (i+1) + ".sayı = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nSayıların Sıralanmamış Hali:");
		for(int i = 0; i < total; i++)
		{
			System.out.print(" " + arr[i]);
		}
		
		bubbleSort(arr, total);
		
		System.out.print("\nSayıların Sıralanmış Hali");
		for(int i = 0; i < total; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
	
	public static void bubbleSort (int arr[], int total){
		
		int temp;
		
		for (int i = 1; i < total; i++)
		{
			for (int j = 0; j < (total - 1); j++)
			{
				if (arr[j] >= arr[j+1])
				{
			           temp = arr[j];
	                   	   arr[j] = arr[j+1];
	                           arr[j+1] = temp;
	                        }
			}
		}
	}
}
