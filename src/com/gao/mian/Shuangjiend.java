package com.gao.mian;

import java.util.Scanner;

/**
 * 输入一个二维数组，每行输入结束，
 * 点击enter进入下一行输入，双击结束输入。
 * @author ming
 *
 */
public class Shuangjiend {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入【1,3，4,5,6,7，】样式的字符串：");
		String str=sc.nextLine();
		String[] s=str.split(",");
		int n=s.length;
		for (int i = 0; i <s.length; i++) {
			if(i%3==0) {
				System.out.println();
			}
			System.out.print("第"+i+"个"+s[i]+",");
		}
		System.out.println(n);
		int row=(int) Math.floor(n/3.0);
		System.out.println(row);
		String[][] a=new String[row][3];
		int k=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=s[k];
				k++;
			}
		}
		System.out.println("输出");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				if(j!=2) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
        System.out.println("后台的s:");
        sc.close();
	}
}
