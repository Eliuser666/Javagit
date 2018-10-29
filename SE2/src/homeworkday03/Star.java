package homeworkday03;
/*按要求编写程序
考查知识点：多态成员的特点；  
要求：
1、定义明星类，有姓名和年龄的属性，且属性不写private修饰符，
提供无返回值的无参数的自我介绍的方法，方法内容为：”我是明星xxx，我今年xxx岁了；”
2、定义明星的子类，
重写父类的自我介绍的方法，内容为：
”我是明星子类，我的名字是xxx，我今年xxx岁了；”,
提供一个无参数的无返回值的跳舞的方法，内容为：”我是明星的子类，我跳拉丁舞......”
3、定义测试类，
使用多态的形式创建明星的子类的对象，
使用该对象分别给姓名和年龄属性赋值，
再调用自我介绍的方法，然后通过类型转换，调用子类跳舞的方法；
*/
public class Star {
 String name;
 int age;
 public void introduction(){
	 System.out.println("我是明星"+name+"我今年"+age+"岁了");
 }
}
 
class StarZi extends Star{

	public void introduction(){
		System.out.println("我是明星子类，我的名字是"+super.name+"，我今年"+super.age+"岁了;");
	}

	public	void dance(){
	 System.out.println("我是明星的子类，我跳拉丁舞"); 
	 }
 }

