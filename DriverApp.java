package com.Currency;

import java.util.Arrays;
import java.util.Scanner;


public class DriverApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. Currency Notes in your Country");
		int size = sc.nextInt();
		
		int currency[] = new int[size];
		System.out.println("Enter denominations of the currency notes");
	for (int i = 0; i < currency.length; i++) {
		currency[i] = sc.nextInt();
		
		
	}
	System.out.println("Before Sorting" + Arrays.toString(currency));
	MergeSort ms = new MergeSort();
	ms.sort(currency, 0, size-1);
	System.out.println("After Sorting" + Arrays.toString(currency));
	
	System.out.println("Please Enter the amount");
	int amount = sc.nextInt();
	
	NoteCount nc = new NoteCount();
	nc.counting(currency,amount);
	
	
	}

}
