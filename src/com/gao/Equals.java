package com.gao;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("输入第一个字符串：");
		String s1=sc.nextLine();
		System.out.print("输入第二个字符串：");
		String s2=sc.nextLine();
		System.out.println(s1+s2);
		char a[]=s1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			System.out.print(c+",");
		}
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(equla(s1,s2));
		sc.close();
	}

	private static boolean equla(String s1, String s2) {
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
}
