package coreJavaTelusko;

class mobile{
	String brand;
	int price;
	static String name;
	
	public void  show() {
		System.out.println(brand+" "+price+" "+name+" ");
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		
		mobile obj1=new mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		obj1.name="iphone 13 pro";
		
		mobile obj2=new mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		obj2.name="Samsung S24 ultra";
		
		obj1.name="phone";
		
		obj1.show();
		obj2.show();
		
		
		
	}

}
