package com.reflect;

import java.lang.reflect.Field;

public class Reflect {

	public static void main(String[] args) throws ReflectiveOperationException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.reflect.Student");
		Object stu=clazz.newInstance();
	//	Field getField(String name)  :�����ֶ����ƻ�ȡ�������ֶζ���
		Field f=clazz.getField("age");
		//System.out.println(f);
//		f.set(stu, 28);
//		Object age = f.get(stu);
//		System.out.println(age);
//		System.out.println(stu);
		//method(clazz);

	}

	private static void method(Class clazz) {
		Field[] fs = clazz.getFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
		System.out.println("----------");
		//getDeclaredFields()  ����ȡ���еĳ�Ա����
		Field[] fs2 = clazz.getDeclaredFields();
		for (int i = 0; i < fs2.length; i++) {
			System.out.println(fs2[i]);
		}
	}

}
