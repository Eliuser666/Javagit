package com.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{checkScore(110);}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void checkScore(int score) {
		if (score < 0 || score > 100) {
			throw new RuntimeException("���Գɼ�������Ҫ��");
		}
		System.out.println("���Գɼ�����Ҫ��");
	}

}
