package oops_concept;
class Shape{
	String color;
	public void area() {
		System.out.println("display area");
	}
}
class Traingle extends Shape{
	public void area(int l, int h) {
		System.out.println("display area="+1/2*l*h);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Traingle t1=new Traingle();
		t1.color="red";
		Traingle t2=new Traingle();
		t2.area(12,6);
	}

}
