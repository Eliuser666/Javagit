package homeworkday07;

import java.util.ArrayList;

public class DishesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< Dishes> al = new ArrayList<>();
		Dishes cai = new Dishes("������", 58, 4);
		Dishes cai2 = new Dishes("Ƥ������", 8, 1);
		Dishes cai3 = new Dishes("�����", 2, 10);
		Dishes cai4 = new Dishes("����", 8, 1);
		al.add(cai);
		al.add(cai2);
		al.add(cai3);
		al.add(cai4);
		System.out.println(al);
		double total   =  0 ; 
		// ���� ���� 
		for (Dishes c  : al) {
			// ��ӡ
			String name = c.getName();
			int num = c.getNum();
			System.out.println("���� :" + name+" -- " + num +"��");
			// ���� �ܼ� 
			//��ȡ ÿһ�� �˵ĵ��� .   ���� * ����  
			total += c.getPrice()*num; 
		}
		System.out.println("�ܼ�:" +  total);

	}

}
