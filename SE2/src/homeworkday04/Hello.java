package homeworkday04;

public class Hello {
	public String name = "���ǳ�Ա����";
	public static String work = "���Ǿ�̬����";

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
