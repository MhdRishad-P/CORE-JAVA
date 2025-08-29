package coreJavaTelusko;

class Humans{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class ThisKeywordInSettersAndGetters {
	public static void main(String[] args) {
		Humans human=new Humans();
		human.setAge(20);
		human.setName("Rishad");
		
		System.out.println(human.getAge()+":"+human.getName());
		
		
	}

}
