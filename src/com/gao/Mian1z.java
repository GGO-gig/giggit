package com.gao;

import java.awt.Dimension;
import java.util.Scanner;


/**
 * 出租车起步价是10块包含3公里，每公里2.4元行程大于15公里加收每公里的50%，
 * 堵车3分钟加2.4元，给一个方法写出出租车计价。
 * @author ming
 *System.nanoTime() 返回最准确的可用系统计时器的当前值，以毫微秒为单位
 */
public class Mian1z {
	public static void main(String[] args) {
		double sum=0;
		Scanner  sc=new Scanner(System.in);
		System.out.print("输入出租车行走的路程：");
		float   lu=sc.nextFloat();
		
		Timer frame = new Timer("计时器");  
        frame.pack();  
        frame.setVisible(true); 
        float ti=0;
        Dimension  min=frame.getMinimumSize();
        System.out.println(min);
		int   x=(int)lu;
		System.out.print("出租车应收费：");
		switch (x) {
		case 1:
		case 2:
		case 3: sum=10;
			System.out.println(sum+ti);		
			break;
		case 4: 
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:sum=10+2.4*(lu-3);
			System.out.println(sum+ti);		
			break;
		default:
			sum=38.8;
			int n=(int) Math.floor(lu-15);
			double f=2.4;
			double s1=0;
			for (int i = 16; i < n; i++) {
				f+=f*0.5;
				s1+=f;
			}
			double y=lu-n;
			s1+=f*y;
			System.out.println(sum+s1);	
		}
		sc.close();
	}
}
