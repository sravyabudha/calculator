package com.calc.extendedcalc;

import java.util.Scanner;
import com.calc.simplecalc.simplec;
import com.calc.maincalc.mainc;

public class extendedc extends simplec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		mainc s=new mainc();
		s.menu();
		simplec sim=new simplec();
		int ch=sc.nextInt();
		if (ch==1)
			{
				sim.addition();
			}
		else
			{
				sim.substraction();
			}
		int c;
		System.out.println("Enter the third number");
		c=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("Enter your choice");
		int sr=sc.nextInt();
		if (sr==1)
		{
			System.out.println("Addition of the three numbers: "+(a+b+c));
		}
		else
			System.out.println("Substraction of the three numbers: "+(a-b-c));
	}
}
