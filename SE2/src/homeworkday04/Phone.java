package homeworkday04;
/*编写一个手机类，提供两个属性,一个品牌,一个颜色,再提供一个打电话的功能，
 * 和一个展示手机的功能 然后进行测试

比如:  手机		属性: 品牌,颜色  --定义成私有的 
          		方法: 电话 功能 ---定义成静态的
                     展示 展示手机的品牌和颜色
演示格式如下：*/

class Phone {

private String brand;
private String color;

public Phone() {
	// TODO Auto-generated constructor stub
}

public Phone(String brand, String color) {
	this.brand = brand;
	this.color = color;
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public static void Call(){
	System.out.println("手机打电话");
	
}
void Show(){
	System.out.println("手机的品牌是："+getBrand()+"\n颜色是："+getColor());
}
}
