package com.gao;

public class StringInter {
	public static void main(String[] args) {
		String phone="46644";
		Integer it = Integer.valueOf(phone);
		System.out.println(it);
		int i = it.intValue();
		System.out.println(i);
		System.out.println(phone.length());
	}
}
