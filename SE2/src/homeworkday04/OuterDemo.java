package homeworkday04;
interface Inter{
	void show();
}
class Outer {
	//²¹È«´úÂë
/*	void method(){}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
	}*/
	public static Inter method(){
		return new Inter(){
			@Override
			public void show() {
				System.out.println("HelloWorld");
			}
		};
}

}
public class OuterDemo {
		public static void main(String[] args) {
			Outer.method().show();//HelloWorld
		}

}
