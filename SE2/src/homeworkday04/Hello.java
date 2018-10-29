package homeworkday04;

public class Hello {
	public String name = "我是成员变量";
	public static String work = "我是静态变量";

	public void work() {
		System.out.println(name);
		System.out.println(work);
	}

	public static void name() {
		// System.out.println(name);
		System.out.println(work);
	}
	public static void main(String[] args) {
		new Hello().work();
		name();
	}
}
