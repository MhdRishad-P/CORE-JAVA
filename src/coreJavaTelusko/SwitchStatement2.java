package coreJavaTelusko;

public class SwitchStatement2 {
	public static void main(String[] args) {
		String Day="Sunday";
		switch(Day) {
		case "Saturday","Sunday" -> System.out.println("6am");
	
		case "Monday" -> System.out.println("8am");
			
		default -> System.out.println("7am");
			
		}
	}

}
