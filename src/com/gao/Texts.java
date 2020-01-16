package com.gao;

public class Texts {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		do {
			b+=2;
			a-=2+b;
			System.out.println(a);
			System.out.println(b);
			c++;
		}while(a>=0);
		System.out.println(c);
	}
}
