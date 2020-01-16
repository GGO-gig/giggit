package com.gao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射
 *  Clazz.getName()获取类的完整名字
    getPackage（）获取此类所属的包
    getSuperclass() 获取父类对应的Class对象
    getFiled(String name) 获得类的指定成员变量
    getMethods() 获得类的public类型的方法
    getMethod(String name, Class[] args) 获取类的指定方法
 * @author ming
 *
 */

public class ReflectionTest {
	
	public String test(String name ,int age) {
		
		return name+"，今年"+age+"岁，是一个极富好奇心地乐观青年！";
	}
	
	public static void main(String args[]) {
		
			String str = "test , reflection";
			int len1 = str.length();
			System.out.println("直接调用length() :"+len1);
			
			//反射String.length()方法
			//直接填入调用该方法的对象str，这里不需要newInstance()
			Object len2 = Reflection(str,str.getClass(),"length",null,null);
			System.out.println("java 反射调用length() :"+len2);
	
			Class<?> clazz;
		
				try {
					
					//调用自己创建的函数，
					//反射得到类 包名+类名，我这边没有包名就直接是 "ReflectionTest"
					clazz = Class.forName("com.gao.ReflectionTest");
					
					//直接java反射得到方法
					Method method= clazz.getMethod("test",String.class,int.class);
					Object obj1 = method.invoke(clazz.newInstance(),"xiaojun",23);
					System.out.println("直接反射："+obj1);
					
					
					//创建函数完成反射
				  //创建参数class 类型的数组
					Class<?> cla[] = {String.class,int.class};
					Object obj = Reflection(clazz.newInstance(),clazz,"test",cla,"小君",22);
					System.out.println("创建函数完成反射: "+obj);
					
				
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 
	}
	
	/*
	 * 通过反射执行cclass的方法
	 * @param   object  ---调到该方法的具体对象
	 * @param   cclass  ---具体对象的class类型
	 * @param   paramClasses ---反射方法中参数class类型
	 * @param   methodName   ---反射方法的名称
	 * @param   args    ----调用该方法用到的具体参数
	 * 
	 * 
	 * */
	public static Object Reflection(Object object ,Class<?> cclass,String methodName,Class<?>[] paramclasses, Object... args) {
		
		try {
			
			Method method = cclass.getMethod(methodName,paramclasses);
			return method.invoke(object,args);
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
 
}
 
    /* 运行结果：
        直接调用length() :17
        java 反射调用length() :17
        直接反射：xiaojun，今年23岁，是一个极富好奇心地乐观青年！
        创建函数完成反射: 小君，今年22岁，是一个极富好奇心地乐观青年！*/

