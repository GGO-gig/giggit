package com.gao.mian;


import java.util.Scanner;

/**
 * 把一个数分解成任意几个数之和“, 请通过编写代码(语言不限),
 * 试着把一个数的所有和式分解的结果全部输出出来, 
 * 例如:4的结果有,(***************************) 
 * 调试好代码请发到以下邮箱; 邮件主题带上你的名字和手机号码;
 *  联系邮箱:jiangchama@foxmail.com
 * @author ming
 *思路：
 *1=1
 *2=1+1
 *3=1+2
 *4=1+3=2+2
  5=1+4=2+3
  6=1+5=2+4=3+3
 */
public class AoFeng {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int x=sc.nextInt();
		System.out.println(x/2);
		while(x<=0) {
			System.out.print("输入错误，请重新输入一个正整数：");
			 x=sc.nextInt();
		}
		System.out.println("从中间开始");
		System.out.println(x+"的结果有：");
		if(x%2==0) {
			for(int i=x/2;i<x;i++) {
				System.out.println(i+"+"+(x-i));
			}
		}else {
			for(int i=x/2+1;i<x;i++) {
				System.out.println(i+"+"+(x-i));
			}
		}
		
		System.out.println("从1开始");
		System.out.println(x+"的结果有：");
		for(int i=1;i<=x/2;i++) {
			System.out.println(i+"+"+(x-i));
		}
		
		System.out.println("分解为从1加的有：");
		fenjie(x);
		sc.close();
	}

	private static void fenjie(int x) {
			
	}

}
