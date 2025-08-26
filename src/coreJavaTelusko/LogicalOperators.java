package coreJavaTelusko;

public class LogicalOperators {
	public static void main(String[] args) {
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		
//		AND OPERATOR
		
		boolean result1=x>y && a>b;
		System.out.println(result1);
		
//		OR OPERATOR
		boolean result2=x>y || a>b;
		System.out.println(result2);
		
//		NOT OPERATOR
		boolean result3=a>b;
		System.out.println(!result3);
		
		
	}

}
