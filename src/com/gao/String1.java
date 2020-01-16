package com.gao;

/**
 * 思维虫洞面试题
 * 1.输入：一个字符串，字符串内容是一片含有标点符号和空格的文章
 * 2输出：将这个字符串中出现的英文单词数量排在强三行用回车凭借后返回
 * @author ming
 *输出结果：
 *adb df 
fdkj fdf fdf
df,ff fdj fdf 
fdd.fjkj
 fdf,fdf
fff fdf.df fdfda abs
一行对应一个下标，安行输出字符串:
s[0]=adb df 
s[1]=fdkj fdf fdf
s[2]=
s[3]=df,ff fdj fdf 
s[4]=fdd.fjkj
s[5]= fdf,fdf
s[6]=fff fdf.df fdfda abs
标点符号用空格代替分割：
adb+df+2
fdkj+fdf+fdf+3
+1
df+ff+fdj+fdf+4
fdd+fjkj+2
fdf+fdf+2
fff+fdf+df+fdfda+abs+5
输出按每行单词降序排列的字符串数组：
s[0]=fff fdf.df fdfda abs
s[1]=df,ff fdj fdf 
s[2]=fdkj fdf fdf
s[3]= fdf,fdf
s[4]=fdd.fjkj
s[5]=adb df 
s[6]=
目标输出：
fff fdf.df fdfda abs
df,ff fdj fdf 
fdkj fdf fdf
 */
public class String1 {
	
	public static void main(String[] args) {
		String str="adb df \nfdkj fdf fdf\r\ndf,ff fdj fdf \nfdd.fjkj\r fdf,fdf\nfff fdf.df fdfda abs";
		System.out.println(str);
		String s=analyse(str);
		System.out.println("目标输出：");
		System.out.println(s);
	}

	public static String analyse(String str) {
		//以\r（回车）或\n（换行）将str分割为字符串数组，即一行对应一个下标,安行输出
		System.out.println("一行对应一个下标，安行输出字符串:");
		String[] s=str.split("\r|\n");
		for (int i = 0; i < s.length; i++) {
			System.out.println("s["+i+"]="+s[i]);
		}
		//将字符串中的标点符号用空格代替,在用空格分割，每行长度代表单词数
		System.out.println("标点符号用空格代替分割：");
		for (int i = 0; i < s.length; i++) {
			String[] si=s[i].trim().replace(","," ").replace(".", " ").split(" ");
			for (int j = 0; j < si.length; j++) {
				System.out.print(si[j]+"+");
			}
			System.out.println(si.length);
		}
		
		//采用选择排序法，按每行单词个数降序排列
		for (int i = 0; i < s.length; i++) {
			String[] si=s[i].trim().replace(","," ").replace(".", " ").split(" ");
			for (int j = i+1; j < s.length; j++) {
				String[] sj=s[j].trim().replace(","," ").replace(".", " ").split(" ");
				if(si.length<sj.length) {
					String k=s[i];
					s[i]=s[j];
					s[j]=k;
				}
			}
		}
		System.out.println("输出按每行单词降序排列的字符串数组：");
		for (int i = 0; i < s.length; i++) {
			System.out.println("s["+i+"]="+s[i]);
		}
		
		String re=s[0]+"\r"+s[1]+"\r"+s[2];
		return re;
	}
}

