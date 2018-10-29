package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

	public static void main(String[] args) throws ReflectiveOperationException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.reflect.Student");
		//Constructor<?>[] getConstructors() :获取所有public修饰的构造方法
		//method(clazz);
		//Constructor<T> getConstructor(Class<?>... parameterTypes) 
		//method2(clazz);
		//method3(clazz);
	}

	private static void method3(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Constructor c=clazz.getConstructor(String.class,int.class);
		System.out.println(c);
		Object obj=c.newInstance("lisi",18);
		System.out.println(obj);
	}

	private static void method2(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Constructor c=clazz.getConstructor();
		System.out.println(c);
		Object obj=c.newInstance();
		System.out.println(obj);
	}

	private static void method(Class clazz) {
		Constructor[] cs=clazz.getConstructors();
		for(int i=0;i<cs.length;i++){
			System.out.println(cs[i]);
		}
	}

}
