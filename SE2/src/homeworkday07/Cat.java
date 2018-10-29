package homeworkday07;

import java.util.ArrayList;
import java.util.Iterator;

/*成员属性(私有)：
名称：(String类型)
颜色：(String类型)
年龄：(int类型)
构造方法：
无参
全参
成员方法：
1).get/set方法；
2).重写toString()方法；内部打印所有属性的值；
	b) 在main()方法中，按以下步骤编写代码：
	向集合中添加以下cat对象：
“波斯猫”，“白色”，2
“折耳猫”，“灰色”，1
“加菲猫”，“红色”，3
“机器猫”，“蓝色”，5
1)	按以下步骤编写代码：
a)	定义类：Cat，包含以下成员：

遍历集合
1）	使用普通for循环
2）	迭代器进行遍历
3）	增强for进行遍历
*/
public class Cat {
private	String name;
private	String color;
private	int age;
public Cat() {
	// TODO Auto-generated constructor stub
}
public Cat(String name, String color, int age) {
	this.name = name;
	this.color = color;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
}

public static void main(String[] args) {
	Cat cat1=new Cat("波斯猫","白色",2);
	Cat cat2=new Cat("折耳猫","灰色",1);
	Cat cat3=new Cat("加菲猫","红色",3);
	Cat cat4=new Cat("机器猫","蓝色",5);
	ArrayList<Cat> array=new ArrayList<Cat>();
	array.add(cat1);
	array.add(cat2);
	array.add(cat3);
	array.add(cat4);
	System.out.println("-------------方式一 普通for------------");
	for(int i=0;i<array.size();i++){
		System.out.println(array.get(i).toString());
	}
	System.out.println("-------------方式二  迭代器------------");
	Iterator<Cat> it=array.iterator();
	while(it.hasNext()){
		Cat c=it.next();
		System.out.println(c);
		
	}
	System.out.println("-------------方式三  增强for------------");
	for(Object obj:array)
	{
		System.out.println(obj);
	}
}


}
