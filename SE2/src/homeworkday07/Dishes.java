package homeworkday07;
/*ģ�� ������˳���. �����Ʒ��,����Ϊ����,�۸�,����. ������������ɲ�Ʒ����. 
��������,��ӡ�����������в�Ʒ���ƺ������ܽ��.*/

public class Dishes {
private String name;
private int price;
private int num;
public Dishes(String name, int price, int num) {
	super();
	this.name = name;
	this.price = price;
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Dishes [name=" + name + ", price=" + price + ", num=" + num + "]";
}



}
