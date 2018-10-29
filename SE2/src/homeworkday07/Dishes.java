package homeworkday07;
/*模拟 饭店结账程序. 定义菜品类,属性为名称,价格,数量. 集合中添加若干菜品对象. 
遍历集合,打印出集合中所有菜品名称和消费总金额.*/

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
