package coreJavaTelusko;

class Computer{
	public void  playMusic(){
		
		System.out.println("Music Playing");
	}
	
	public String getMePen(int cost) {
		if(cost>=10)
		return "pen";
		else
			return "Nothing";
	}
}

public class Methods {
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.playMusic();
		String str=computer.getMePen(12);
		System.out.println(str);
	}

}
