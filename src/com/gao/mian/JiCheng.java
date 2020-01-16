package com.gao.mian;

public class JiCheng {
	public static void main(String[] args) {
		B b=new B();
		B.text();
		b.text1();
	}
}
class A{
	public A() {
		System.out.println("A");
	}
}
class B extends A{
	public B() {
		System.out.println("B");
	}
	
	public static void text(){
		System.out.println("我是B测试！");
	}
	public  void text1(){
		System.out.println("我是B测试1！");
	}
}