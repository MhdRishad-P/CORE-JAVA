package coreJavaTelusko;
class Human{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age=a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
		
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Human human=new Human();
		human.setName("Rishad");
		human.setAge(30);

		
		System.out.println(human.getName()+" "+human.getAge()+" ");
		
		
	}

}
