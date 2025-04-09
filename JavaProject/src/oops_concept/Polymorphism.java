package oops_concept;
class Learner{
	String name;
	int age;
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name+" "+age);
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Learner l1=new Learner();
		l1.printInfo(25);
		l1.printInfo("Sunil");
		l1.printInfo("Rakesh", 26);
	}
}
//poly=many morphism=forms