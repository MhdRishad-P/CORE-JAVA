package coreJavaTelusko;
class AAA{
	public void show() {
		System.out.println("In Show AAA");
	}
}
class BBB extends AAA{
	public void show() {
		System.out.println("In show BBB");
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {
		BBB bbb=new BBB();
		bbb.show();
		
	}

}
