package com.algorithm;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Handan Kara
 *
 * 
 */
public class SelectionSort {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			Random rand=new Random(); //random sınıfı
			
			System.out.print("Dizinin eleman sayısının giriniz: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			for (int i = 0; i < size; i++) {
				arr[i] = rand.nextInt(20);
			}
			
			System.out.print("\nDizinin Sıralanmamış Hali:");
			for (int i = 0; i < size; i++) {
				System.out.print(" " + arr[i]);
			}
			
			selectionSort (arr, size);
			
			System.out.print("\nDizinin Sıralanmış Hali:");
			for (int i = 0; i < size; i++) {
				System.out.print(" " + arr[i]);
			}
		}
		
		public static void selectionSort (int arr[], int size)
		{
			int i, j, minIndex, temp;
			
			for (i = 0; i < size - 1; i++) {
			   	minIndex = i;
				
				for (j = i+1; j < size; j++) {
					
					if (arr[j] < arr[minIndex]) 
						 minIndex = j;
				}
				
				if (minIndex != i) {
					
					temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
}
