package com.lianxi.day2;

import java.util.Scanner;

public class choushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		int i=getuglyNumber(g);
		System.out.println(i);

	}

	public static int getuglyNumber(int index) {
		if (index == 1) {
			return 1;
		} else {
			int count = 1;
			
			for (int i = 2;; i++) {
				if (isuglyNumber(i)) {
					count++;
				}
				if (count == index)
					return i;
			}
		}

	}

	public static boolean isuglyNumber(int number) {
		if (number < 1) {
			return false;
		}
		if (number == 1) {
			return true;
		}
		while (number % 2 == 0)
			number /= 2;
		while (number % 3 == 0)
			number /= 3;
		while (number % 5 == 0)
			number /= 5;
		return number == 1;

	}

}
