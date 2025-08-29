package coreJavaTelusko;

public class Inheritence {
	public static void main(String[] args) {
		AdvCalc calc=new AdvCalc();
		int r1=calc.add(4,5);
		int r2=calc.sub(5,6);
		int r3=calc.multi(5, 5);
		int r4=calc.div(15, 3);
		
		System.out.println(r1+"\n"+r2+"\n"+r3+"\n"+r4);
	}

}
