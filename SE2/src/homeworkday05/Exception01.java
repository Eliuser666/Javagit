package homeworkday05;

import java.util.Scanner;

/*
定义main()方法，按以下要求编写代码：
定义一个方法：print(int[] arr)，
可以打印一个int数组的内容，
在方法内按以下步骤编写代码：
在try代码块内遍历数组，打印每个元素；
在catch代码块内监控并捕获空指针异常：
NullPointerException，如果异常，打印：错误，数组引用为NULL。
*/

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { Scanner sc = new Scanner(System.in); int i = sc.nextInt(); }
		 * catch (Exception e) { System.out.println("请输入整数！"); }
		 */

		int[] arr = null;

		print(arr);
	}

	public static void print(int[] arr) {
		try {
			for (int x = 0; x < arr.length; x++) {
				System.out.print(arr[x] + " ");

			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("错误，数组引用为NULL");
		} finally {
			System.out.println("方法执行完毕");
		}

	}
}
