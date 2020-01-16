package com.gao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 思维虫洞面试题
 * 1.输入：一个字符串，字符串内容是一片含有标点符号和空格的文章
 * @author ming
 *
 */
public class String2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入：");
	        List<String> list= new ArrayList<String>();
	        String s = null;
	        while (!(s = sc.nextLine()).equals("")) {
	                list.add(s);
	        }
	        System.out.println("输出");
	        for (String i : list) {
	        	s+=i;
				System.out.println(i);
				s+="\n";
			}
	        System.out.println("后台的s:");
	        System.out.println(s);
	        
	        String key=String1.analyse(s);
	        System.out.println("返回输出：");
	        System.out.println(key);
		sc.close();
	}
}
