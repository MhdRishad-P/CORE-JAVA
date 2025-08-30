package coreJavaTelusko;

class AAAA {
	public void show() {
		System.out.println("In a show A");
	}
}
class BBBB extends AAAA{
	public void show() {
		System.out.println("In a show b");
	}
}
class CCCC extends BBBB{
	public void show() {
		System.out.println("in a show c");
	}
}

public class DynamicMethodDispatch {
// its runtime polymorphism
	public static void main(String[] args) {
		AAAA obj=new AAAA();
		obj.show();
		
		obj=new BBBB();
		obj.show();
		
		obj=new CCCC();
		obj.show();
	}
	
}
