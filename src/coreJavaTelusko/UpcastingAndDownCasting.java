package coreJavaTelusko;

class One{
	public void show1() {
		
	}
}
class Two extends One{
	public void show2() {
		
	}
	
}

public class UpcastingAndDownCasting {
	public static void main(String[] args) {
//		Upcasting
		One obj=new Two();
		obj.show1();
		
		
// DownCasting
		Two obj1=(Two) obj;
		obj1.show2();
		
		
	}

}
