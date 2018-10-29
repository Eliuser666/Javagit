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
			throw new RuntimeException("考试成绩不符合要求");
		}
		System.out.println("考试成绩符合要求");
	}

}
