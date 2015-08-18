package com.algorithm;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
/**
 * @author handan
 *
 */
public class QuickSort 
{

		public static void main (String[] args) throws IOException 
		{
			
			Scanner sc = new Scanner(System.in);
			Random rand = new Random(); //random sınıfı
			
			System.out.print("Dizinin eleman sayısını giriniz = ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			for (int i = 0; i < size; i++) {
				arr[i] = rand.nextInt(20);//1 den 20 'ye kadar sayılar üretir. 
			}
			System.out.print("Dizinin sıralanmamış Hali :");
			for (int i = 0; i < size; i++) {
				System.out.print(" " + arr[i]);
			}
			
			quickSort(arr, 0, size);
			
			System.out.print("Dizinin sıralmamış Hali :");
			for (int i = 0; i < size; i++) {
				System.out.print(" " + arr[i]);
			}
			
		}
		
		public static void quickSort(int arr[], int left, int right) 
		{
			
			int i = left, j = right, temp;
			int pivot = arr[(left + right)/2];
			
			
			do { 
				while (arr[i] < pivot)
					i++;
				while (arr[j] >= pivot)
					j--;
				if (i <= j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
				
			 if (left < j)
				quickSort(arr, left, j);
		         if (i < right)
				quickSort(arr, i, right);
		}
}
