package homeworkday04;
/*��дһ���ֻ��࣬�ṩ��������,һ��Ʒ��,һ����ɫ,���ṩһ����绰�Ĺ��ܣ�
 * ��һ��չʾ�ֻ��Ĺ��� Ȼ����в���

����:  �ֻ�		����: Ʒ��,��ɫ  --�����˽�е� 
          		����: �绰 ���� ---����ɾ�̬��
                     չʾ չʾ�ֻ���Ʒ�ƺ���ɫ
��ʾ��ʽ���£�*/

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
	System.out.println("�ֻ���绰");
	
}
void Show(){
	System.out.println("�ֻ���Ʒ���ǣ�"+getBrand()+"\n��ɫ�ǣ�"+getColor());
}
}
