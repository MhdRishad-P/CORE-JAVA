package coreJavaTelusko;

class AA{
	public AA() {
		System.out.println("IN A");
	}
	public AA(int n) {
		System.out.println("In A Int");
	}
	
}
class BB extends AA{
	public BB() {
		super();
		System.out.println("IN B");
	}
	public BB(int n) {
		super(5);
		System.out.println("In B int");
	}
	
}


public class ThisAndSuperMethod {
	public static void main(String[] args) {
		BB bb=new BB(5);
	}


}
