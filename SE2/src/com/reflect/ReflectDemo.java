package com.reflect;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//��ȡ�ֽ����ļ����ַ�ʽ
		Student s=new Student();
		Class clazz=s.getClass();
		System.out.println(clazz);
		System.out.println("-------------");
		Class clazz2=Student.class;
		System.out.println(clazz2);
		System.out.println("-------------");
		Class clazz3=Class.forName("com.reflect.Student");
		System.out.println(clazz3);
		System.out.println("-------------");
		//ͨ����ȡ�Ĺ��촴������
		
		
		
	}

}
