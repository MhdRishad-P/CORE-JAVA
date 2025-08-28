package coreJavaTelusko;

public class StaticBlock {
	class Mobile{
		String brand;
		int price;
		String name;
	}
	static {
		System.out.println("In static block");
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Mobile");
		
	}

}
