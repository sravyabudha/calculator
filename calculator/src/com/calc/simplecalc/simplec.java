package com.calc.simplecalc;

public class simplec 
{
	public static int a;
	public static int b;
	public void addition()
	{
		System.out.println("Addition: "+(a+b));
	}
	public void substraction()
	{
		System.out.println("Substraction: "+(a-b));
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
