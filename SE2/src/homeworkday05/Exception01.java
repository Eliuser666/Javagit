package homeworkday05;

import java.util.Scanner;

/*
����main()������������Ҫ���д���룺
����һ��������print(int[] arr)��
���Դ�ӡһ��int��������ݣ�
�ڷ����ڰ����²����д���룺
��try������ڱ������飬��ӡÿ��Ԫ�أ�
��catch������ڼ�ز������ָ���쳣��
NullPointerException������쳣����ӡ��������������ΪNULL��
*/

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { Scanner sc = new Scanner(System.in); int i = sc.nextInt(); }
		 * catch (Exception e) { System.out.println("������������"); }
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
			System.out.println("������������ΪNULL");
		} finally {
			System.out.println("����ִ�����");
		}

	}
}
