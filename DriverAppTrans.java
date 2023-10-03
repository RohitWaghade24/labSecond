package com.transactionTargets;

import java.util.Arrays;
import java.util.Scanner;

public class DriverAppTrans {

	public static void main(String[] args) {
		
		int nod;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the no. of days shop will be OPEN");
		nod=sc.nextInt();
		
		int trans[] = new int[nod];
		int i;
		for ( i = 0; i < trans.length; i++) {
			System.out.println("Please enter income of day" + (i+1));
			trans[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));
		
		System.out.println("Please eneter no. of targets");
		int targets=sc.nextInt();
		
		int sum;
		int flag;
		for(int j=1; j<=targets; j++)
		{
			System.out.println("Please enter for value for target" + j);
			int singleTargets=sc.nextInt();
			flag=0;
			sum=0;
			
			for(int k=0; k<trans.length;k++)
			{
				sum=sum+trans[k];
				if(sum>=singleTargets)
				{
					flag=1;
					System.out.println("Target achieved on day" + (k+1));
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Target NOT achieved");
			}
		}

	}

}
