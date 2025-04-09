package oops_concept;

class Pen {
	String color;
	String type;//ballpoint;gel
	public void write() {
		System.out.println("Write something");
		
	}
	public void printColor() {
		System.out.println(this.color);
	}
	
}

class Student {
	String name;
	int age;
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(){
		System.out.println("Called constructor");
	}
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
}
public class Opps {
	
	public static void main(String args[]) {
		Pen pen1=new Pen();
		pen1.color="blue";
		pen1.type="gel";
		pen1.write();
		
		Pen pen2=new Pen();	
		pen2.color="Yellow";
		pen2.type="ballPoint";
		pen1.printColor();
		pen2.printColor();
		
		Student student1=new Student();
		student1.name="ajay";
		student1.age=12;
		student1.printInfo();
		Student student2=new Student("Dnyanesh",26);
		student2.printInfo();
	}
}