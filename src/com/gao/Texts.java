package com.gao;

public class Texts {
	
	public static int test1() {
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
		return c;
	}
	
	public static void test2() {
		String s=" dd ff,gg ll.";
		String a="ll ddl df,df.";
		String[] s1=s.replace(","," ").replace("."," ").trim().split(" ");
		String[] sa=a.replace(","," ").replace("."," ").trim().split(" ");
		boolean b=s1.length>sa.length;
		System.out.println(b);
		System.out.println(sa.length);
		System.out.println(s1.length);
	}
	public static void main(String[] args) {
//		int c=test1();
//		System.out.println(c);
		test2();
	}
}
