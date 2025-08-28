package coreJavaTelusko;

class Student{
	String name;
	int rollNo;
	int marks;
}


public class ArrayObjects {
	public static void main(String[] args) {
		
		
		
		Student student1=new Student();
		student1.name="rishad";
		student1.rollNo=19;
		student1.marks=80;
		
		Student student2=new Student();
		student2.name="rikas";
		student2.rollNo=20;
		student2.marks=50;
		
		
		Student student3=new Student();
		student3.name="rishana";
		student3.rollNo=21;
		student3.marks=40;
		
		Student Students[]=new Student[3];
		Students[0]=student1;
		Students[1]=student2;
		Students[2]=student3;
		
		for(int i=0;i<Students.length;i++) {
			System.out.println(Students[i].name+" "+Students[i].rollNo+" "+Students[i].marks);
		}
		
	}

}
