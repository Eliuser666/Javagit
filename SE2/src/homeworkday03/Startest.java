package homeworkday03;

/*3、定义测试类，
使用多态的形式创建明星的子类的对象，
使用该对象分别给姓名和年龄属性赋值，
再调用自我介绍的方法，然后通过类型转换，调用子类跳舞的方法；*/
public class Startest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star st = new StarZi();
		st.name="李四";
		st.age=20;
		st.introduction();
		StarZi sz=(StarZi)st;
		sz.dance();
		
	}

}
