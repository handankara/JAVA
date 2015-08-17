package com.algorithm;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author handan
 *
 */
public class InsertionSort {
	
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dizinin eleman sayısı:");
		int total = sc.nextInt();
		int arr[] = new int[total];
		
		for (int i = 0; i < total; i++)
		{
			System.out.print("\n" + (i+1) + ".sayıyı giriniz: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nDizinin Sıralanmamış Hali:");
		for (int i = 0; i < total; i++)
		{
			System.out.print(" " + arr[i]);
		}
		
		insertionSort(arr, total);
		
		System.out.print("\nDizinin Sıralanmış Hali:");
		for (int i = 0; i < total; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
	
	public static void insertionSort (int arr[], int total) {
		
		for (int i = 1; i < total; i++)
		{
			int temp = arr[i];
			int j = i;
			
			while (j > 0 && temp < arr[j-1])
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp; 
		}
	}
}
