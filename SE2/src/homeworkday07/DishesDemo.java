package homeworkday07;

import java.util.ArrayList;

public class DishesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< Dishes> al = new ArrayList<>();
		Dishes cai = new Dishes("烤羊腿", 58, 4);
		Dishes cai2 = new Dishes("皮蛋豆腐", 8, 1);
		Dishes cai3 = new Dishes("烤板筋", 2, 10);
		Dishes cai4 = new Dishes("可乐", 8, 1);
		al.add(cai);
		al.add(cai2);
		al.add(cai3);
		al.add(cai4);
		System.out.println(al);
		double total   =  0 ; 
		// 遍历 集合 
		for (Dishes c  : al) {
			// 打印
			String name = c.getName();
			int num = c.getNum();
			System.out.println("菜名 :" + name+" -- " + num +"份");
			// 计算 总价 
			//获取 每一个 菜的单价 .   单价 * 份数  
			total += c.getPrice()*num; 
		}
		System.out.println("总价:" +  total);

	}

}
